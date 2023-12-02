// const { defineConfig } = require('@vue/cli-service')
// module.exports = defineConfig({
//   transpileDependencies: true,
//   devServer:{
//     port:7005
//   }
// })
const { defineConfig } = require('@vue/cli-service');

module.exports = defineConfig({
  assetsDir: 'static',
  devServer: {
    port: 7005,
    proxy: {
      '/api': {
        target: 'http://localhost:8080', // 后端服务器地址
        changeOrigin: true,
        pathRewrite: {
          '^/api': ''
        }
      }
    }
  }
});


