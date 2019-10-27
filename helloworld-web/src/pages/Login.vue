<template>
  <div>
    <div>
         用户名：<Input v-model="param.username" style="width: 300px" />
     </div>
    <div>
        密码：<Input v-model="param.password" type="password"  style="width: 200px" />
    </div>
     <Button type="primary" @click="login">登录</Button>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      param: {
        username: '',
        password: ''
      }
    }
  },
  methods: {
    login() {
      this.$api.post('login', this.param, r => {
        console.log("登录成功")
      })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
