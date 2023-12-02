<template>
  <div style="width: 100%;position: relative">

    <el-button @click="showPrev()" type="primary" icon="el-icon-arrow-left" class="pos1"></el-button>
    <el-button @click="showNext()" type="primary" icon="el-icon-arrow-right" class="pos2"></el-button>
    <div style="width: 79%;margin:auto;">

      <VueSlickCarousel v-bind="settings" ref="carousel" style="z-index: 2">

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020005.jpg?k=72685126232ac4f56fd252e177ab29a301edfaefbcc1b881198a33260c9920e2&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              镇江
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：64千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020194.jpg?k=247abb4a8a2cbc56bbb26336880fd3846fb4a0b6fdb2bd75e79e5ca014b02562&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              常州
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：116千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020152.jpg?k=93c45afd3cd0bdea922328655cb73f19b3fc057837a8b696af3bc82301f8ae3b&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              合肥
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：143千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020043.jpg?k=4884b1aa96e08747b13a2eadd55822e1b9804e6b6e29ffd6e263e591845e5116&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              桐乡
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：231千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020097.jpg?k=fe47981e69e37a27e0e112f40caefa6361c7e24edb45d587c6eb7c7d14f5ab10&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              宁波
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：359千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020101.jpg?k=3d508c7ad006fb695bf3d0e4a0cc57da7f3678d115163e5c459dc05974f45e05&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              南昌
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：467千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020048.jpg?k=ae8b03260bba9b42363f92dd6ecbb4d2d3c8d55c8abc15d378f8fb094166a78f&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              温州
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：484千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020109.jpg?k=b049d779931f699a09396710a160336da24590f2e78e5f63c4fa4fbf44b7fd70&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              洛阳
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：655千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020161.jpg?k=88e4faa0c253fc1da029708ea347130e4b0c62c133d57d00325b221d86ff306e&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              福州
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：669千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020195.jpg?k=a25b3baf4140f4935563e813db3a20718e2344a7d1260be1dedc6061c7e368ab&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              长沙
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：705千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020019.jpg?k=9a9f11aab7c830b0f99da82285228c123c29f480cab22c1b8f4c495f56f83eaf&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              宜昌
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：726千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020075.jpg?k=cc890a0d21f0dc386f0ad1e75bfd7271c99e3e69a59ba4936bdb836f1d249ed6&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              石家庄
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：771千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020103.jpg?k=4a5badd763c5669e08a382158b46af31397174c6f3287abf7fecbf927c60e5f4&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              密云
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：940千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020081.jpg?k=c92e52b55cfd8df96ac3cfa7871607f16890e9b212cc521a7ba5aef82a732503&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              汕头
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：989千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020192.jpg?k=21fa9108179d1521f45c3dc4474ee52c47bd9f8c0d6478095d3c6646803bfd76&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              承德
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：994千米
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