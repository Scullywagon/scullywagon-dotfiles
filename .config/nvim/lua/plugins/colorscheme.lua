return {
  {
    "ellisonleao/gruvbox.nvim",
    priority = 1000, -- Ensures it loads before other plugins
    config = function()
      vim.o.background = "dark" -- or "light" for the light variant
      vim.cmd("colorscheme gruvbox")
    end,
  },
}
