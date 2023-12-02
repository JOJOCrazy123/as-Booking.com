<template>
  <div style="width: 100%;position: relative">

    <el-button @click="showPrev()" type="primary" icon="el-icon-arrow-left" class="pos1"></el-button>
    <el-button @click="showNext()" type="primary" icon="el-icon-arrow-right" class="pos2"></el-button>
    <div style="width: 79%;margin:auto;">

      <VueSlickCarousel v-bind="settings" ref="carousel" style="z-index: 2">

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140046085.jpg?k=50f84d6388c242c58de20428624d2bc16c1f24b8e20420dbd655e74196c18f12&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              苏州
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：191千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020084.jpg?k=0c3a53f8ec7636eef021d0bb7c1721438669a2ee0c54d4524ac7898ad23c7f17&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              上海
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：272千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020079.jpg?k=5575f1ea9d95932507a0deadcca7f5a9193e097e7e8666e4fff4600224f22d33&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              绍兴
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：286千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020188.jpg?k=75edaba3ed5381c6594c341f2101a448263ff9885f02dde7610403c6a96ea606&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              义乌
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：330千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020047.jpg?k=a94d99409673e4d111160db57c4971a007223b1bff93d130e1e72196f3c0ac51&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              武汉
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：459千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020006.jpg?k=9ccff62baad25992f2cd5529643970ac39c7e599bc592dccf609f76c33fc535c&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              郑州
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：563千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020088.jpg?k=2a51fe62f6d153da932a4611a1ca0014d5c90d81551d293cab267246e585b171&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              泉州
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：795千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020200.jpg?k=f6e84eb748fd763670fc51bfbb1fc22376eeeb40128e33735263095e83cc5b41&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              北京
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：899千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020071.jpg?k=db56942749ee6f06445853f853c646e6ce2835cd56e2788818599b914b9ecff4&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              顺义
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：917千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020038.jpg?k=5e9a0f8f1d934eac38f05616ba280fcfc8328bc85345302a29724e2890e06d63&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              西安
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：948千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020178.jpg?k=1e258f2ea396733d99e8a7b9f3615f6597fb5e73b6ef60627617139ad4a81cd8&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              大同
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,020千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020159.jpg?k=bfb37ac1f7c2854f69fda0d5be21d3b6c24329d551806d75acda666fe329a42f&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              广州
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,127千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020163.jpg?k=b0535dead17074f15122c8515826497a478af95ccf5b4257d12e7c3d1dd57f16&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              深圳
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,156千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020058.jpg?k=f5ced32ff279904e903a80ae67772652c6ef0ffce2123f9f30177f72cd9f502b&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              乌鲁木齐
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：3,007千米
          </div>
          <div>
          </div>
        </div>


      </VueSlickCarousel>
      <div>
        &nbsp;
      </div>
    </div>
  </div>

</template>
<script>

import VueSlickCarousel from "vue-slick-carousel";

export default {
  data() {
    return {
      settings: {
        "arrows":false,
        "dots": false,
        "dotsClass": "slick-dots custom-dot-class",
        "edgeFriction": 0.35,
        "infinite": false,
        "speed": 500,
        "slidesToShow":6,
        "slidesToScroll": 1,
        "draggable": false,
      },
    }
  },
  components:{
    VueSlickCarousel,
  },
  methods: {
    showNext() {
      this.$refs.carousel.next()
    },
    showPrev() {
      this.$refs.carousel.prev()
    },
  },
}
</script>

<style scoped>
.line1{
  /*width: 50px;*/
  display: inline-block;
  height: 24px;
  text-align: center;
  font-size: small;
  color: black;
}
.col1{
  color: #262626;
}
.col2{
  color: #6B6B6B;
}
.line2{
  /*width: 100px;*/
  display: inline-block;
  height: 24px;
  text-align: center;
  font-size: small;
}
.pos1{
  position: absolute;
  left:9%;
  top:40%;
  z-index: 4;
  color: black;
  width: 15px;
  background: #e5e9f2;
  border: #e5e9f2;
  border-radius: 60px;
}
.pos2{
  position: absolute;
  left:86.5%;
  top:40%;
  z-index: 4;
  color: black;
  width: 12px;
  background: #e5e9f2;
  border: #e5e9f2;
  border-radius: 60px;
}
.wid{
  width :170px;
  height: 136px;
}
.el-col {
  border-radius: 4px;
  width: 23px;
  font-size: small;
  text-align: center;
  height: 24px;
  display: inline-block;
}
.bg-purple-dark {
  background: rgb(0,53,128);
  color: #e5e9f2;
}
</style>