import { defineConfig } from 'tsdown'

export default defineConfig({
  entry: ['es/src/index.ts'],
  format: ['esm', 'cjs'],
  outDir: 'dist',
  sourcemap: true,
  clean: true,
  dts: {
    sourcemap: true,
  },
})
