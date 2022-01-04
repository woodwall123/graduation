// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
// 导入axios，并创建实例
import axios from 'axios'
Vue.config.productionTip = false
const instance = axios.create({
  baseURL: 'http://localhost:1004'
})
// 将这个axios实例加载到Vue的原型上，以便随时可以访问
Vue.prototype.$axios = instance
Vue.use(ElementUI)
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
