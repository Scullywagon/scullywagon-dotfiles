-- Options are automatically loaded before lazy.nvim startup
-- Default options that are always set: https://github.com/LazyVim/LazyVim/blob/main/lua/lazyvim/config/options.lua
-- Add any additional options here
--
local opt = vim.opt

opt.expandtab = true -- Use spaces instead of tabs
opt.shiftwidth = 4 -- Indent/outdent by 4 spaces
opt.tabstop = 4 -- Tab key inserts 4 spaces
opt.softtabstop = 4 -- Backspace deletes 4 spaces

vim.g.autoformat = false
