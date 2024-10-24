# wecasino-proto

## 說明

定義Casino遊戲的紀錄

## 開發設定

### pnpm

* 先安裝 node & npm
* 建議使用 corepack 安裝

``` zsh
corepack enable
corepack prepare pnpm@latest --activate
```

### protobuf

* 使用buf管理proto生成程式碼
* 安裝 [buf](https://buf.build/docs/installation)
* gotag生成，請先安裝

``` zsh
go install github.com/srikrsna/protoc-gen-gotag@latest
```

### pnpm script

``` zsh
# 生成 proto
pnpm gen:go
# 生成 go struct tag
pnpm gen:gotag
# 生成 es
pnpm prepare


buf version 1.45.0
# npx 前置
前置
install nvm
install node 20
npm install

# npm buf 方式
npx buf generate 
npx buf generate --template buf.gen.tag.yaml

# homebrew buf 方式
brew install bufbuild/buf/buf

npx buf generate 
npx buf generate --template buf.gen.tag.yaml
```
### swagger doc 流程
產生 openpi/swagger json 文件
pnpm gen:buf
開啟 docker 利用 swagger ui 顯示 provider.swagger.json 文件
pnpm swagger