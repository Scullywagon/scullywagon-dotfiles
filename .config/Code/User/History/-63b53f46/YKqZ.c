#include <stdio.h> 
#include <unistd.h>
#include <sys/types.h>
#include <stddef.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <sys/wait.h>

#ifndef STDIN_FILENO
#define STDIN_FILENO 0 
#endif

int main(int argc, char** argv)
{
    char cwd[1024];
    char input[1024];
    while(true)
    {
        if (getcwd(cwd, sizeof(cwd)) != NULL)
        {
            const char* home = getenv("HOME");
            if (home != NULL && strstr(cwd, home) == cwd)
            {
                printf("~%s/", cwd + strlen(home));
            }
            else
            {
                printf("%s/", cwd);
            }
        }
        printf(" >> ");

        // dont get this line -- just what the internet told me
        if (fgets(input, sizeof(input), stdin) == NULL)
        {
            break;
        }
        int size = strlen(input);

        if (size > 0 && input[size-1] == '\n')
        {
            input[size-1] = '\0';
        }

        if (strcmp(input, "exit") == 0)
        {
            break;
        }

        char* args[50];

        char* token = strtok(input, " "); // get from input stop on space
        int wordCount = 0;
        while (token != NULL)
        {
            args[wordCount++] = token; //starts on zero and adds each token on iterating count
            token = strtok(NULL, " "); // no clue why null
        } 

        args[wordCount] = NULL; // set the final to null as will have been init from thing

        if (strcmp(args[0], "cd") == 0)
        {
            if (wordCount > 1)
            {
                chdir(args[1]);
            }
            else
            {
                chdir("..");
            }
            continue;
        }

        pid_t pid = fork();
        if (pid == 0) // child ID at zero
        {
            // Child process
            if (execvp(args[0], args) == -1)
            {
                perror("execvp failed");
                exit(EXIT_FAILURE);
            }
        }
        else if (pid > 0) // parent id at childID - 1;
        {
            // Parent process: wait for the child to finish
            wait(NULL);
        }
        else
        {
            // Fork failed
            perror("fork failed");
        }
    }
    return 0;
}