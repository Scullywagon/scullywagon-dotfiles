-- bootstrap lazy.nvim, LazyVim and your plugins
require("config.lazy")

require("neo-tree").setup({
    filesystem = {
        window = {
            width = 25, -- Adjust this number to make the tree skinnier or wider
            side = "right",
        },
        reveal = true,
    },
})
