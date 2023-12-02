<template>
  <div class="home">
    <template>
      <comp1 :IsLogIn="IsLogIn"></comp1>
    </template>
    <div style="position: absolute; top: 63%; width: 100%;">
      <div style="z-index: 100">
        <!--筛选条-->
        <comp2></comp2>
      </div>
      <div style="height: 38px;background-color: transparent"></div>
      <div style="z-index: 10">
        <div class="eig" style="height: 8px; background-color: transparent">
        </div>
        <div>
          <!--根据住宿类型浏览-->
          <comp4></comp4>
        </div>
        <!--爆款目的地-->
        <comp5></comp5>
        <div>
          <!--入住我们的热门特色住宿-->
          <comp6></comp6>
        </div>
        <div>
          <!--快速规划-->
          <comp7></comp7>
        </div>
        <div class="eig">
          <!--精彩下一站，灵感这里找-->
          <comp8></comp8>
        </div>
        <div class="eig" v-if="!IsLogIn">
          <!--获取即时优惠-->
          <comp9> </comp9>
        </div>
        <div>
          <!--探索中国-->
          <comp10></comp10>
        </div>
      </div>
      <img :src="urls[0]" style="margin-left: 10%">
      <div style="display: block; text-align: left;" >
        <div style="font-size: 30px; font-weight: bold; width: 79%; margin: auto">客人喜爱的民宿短租</div>
        <el-link style="margin-left: 80%;font-size: 23px"  type="primary" href="https://www.baidu.com">
          探索民宿短租</el-link>
      </div>
      <!--客人喜爱的民宿短租-->
      <comp11></comp11>
      <!--热门目的地-->
      <comp12></comp12>
      <img :src="urls[1]">
      <!--页尾以及CopyRight-->
      <comp13></comp13>
    </div>
  </div>
</template>

<script>
import comp1 from '../../components/HomeView_Com1.vue'
import comp2 from '../../components/HomeView_Com2.vue'
import comp4 from '../../components/HomeView_Com4.vue'
import comp5 from '../../components/HomeView_Com5.vue'
import comp6 from '../../components/HomeView_Com6.vue'
import comp7 from '../../components/HomeView_Com7.vue'
import comp8 from '../../components/HomeView_Com8.vue'
import comp9 from '../../components/HomeView_Com9.vue'
import comp10 from '../../components/HomeView_Com10.vue'
import comp11 from '../../components/HomeView_Com11.vue'
import comp12 from '../../components/HomeView_Com12.vue'
import comp13 from '../../components/HomeView_Com13.vue'
export default {
  data() {
    return {
      urls:[],
      name:"HomeView",
      IsLogIn:false,
    };
  },
  beforeRouteEnter(to, from, next) {
    // 在进入路由前处理参数
    if (to.params.IsLogIn !== undefined) {
      next(vm => {
        vm.IsLogIn = to.params.IsLogIn;
      });
    } else {
      next();
    }
  },
  components:{
    comp1,
    comp2,
    comp4,
    comp5,
    comp6,
    comp7,
    comp8,
    comp9,
    comp10,
    comp11,
    comp12,
    comp13,
  },
}
</script>

<style>
.home{
}
.eig{
  width: 80%;
  left: 10%;
  position: relative;
}
</style>
