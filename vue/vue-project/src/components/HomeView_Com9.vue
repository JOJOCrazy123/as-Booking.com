<template>
  <div>
    <el-card class="box-card">
      <el-container >
        <el-aside >
          <img src="https://t-cf.bstatic.com/design-assets/assets/v3.68.0/illustrations-traveller/GlobeGeniusBadge.png">
        </el-aside>
        <el-container>
          <el-header height="20%" class="elh1">
            <span style="font-size: 20px">
              <b>获取即时优惠</b>
            </span>
          </el-header>
          <el-main class="elm1">
            <el-row>
              <span>
                <b>
                  只需登录你的Booking.com帐号，寻找蓝色Genius标识即可省钱
                </b>
              </span>
            </el-row>
            <el-row style="height: 80px; background-color: transparent">
            </el-row>
            <el-row>
              <el-button style="border-color: rgb(0,113,194); color: rgb(0,113,194);" @click="gotoLog">
                登录
              </el-button>
              <el-button style="border-color: white; color: rgb(0,113,194);" @click="gotoLog">
                注册
              </el-button>
            </el-row>
          </el-main>
        </el-container>
      </el-container>
    </el-card>
  </div>
</template>

<script>
export default {
  methods:{
    gotoLog(){
      this.$router.push({name:'log'});
    },
  },
}
</script>

<style scoped>
.elh1{
  display: flex;
  align-items: flex-end;
}
.elm1{
  display: flex;
  flex-direction: column;
}
</style>