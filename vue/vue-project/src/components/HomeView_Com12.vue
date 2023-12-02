<template>
  <div style="width: 80%;margin: auto">
    <div style="text-align:left;width:100%;margin:auto;font-size: x-large;color: black"><b>热门目的地</b></div>
    <el-tabs v-model="activeName" type="border-card" @tab-click="handleClick">
      <el-tab-pane label="区域" name="first">
        <el-row>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>马尔代夫</el-link></div><span>807家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>西双版纳</el-link></div><span>81家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>澳大利亚</el-link></div><span>233家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>薄荷岛</el-link></div><span>764住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>富士山</el-link></div><span>548家住宿</span>
          </div></el-col>
        </el-row>
        <el-row>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>英格兰</el-link></div><span>807家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>上海</el-link></div><span>2181家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>海南</el-link></div><span>1323家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>苏梅岛</el-link></div><span>256家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>大理</el-link></div><span>523家住宿</span>
          </div></el-col>
        </el-row>
        <el-row>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>台南地区</el-link></div><span>207家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>兰卡威</el-link></div><span>181家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>普吉府</el-link></div><span>13家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>金马伦高原</el-link></div><span>323家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>巴淡岛</el-link></div><span>135家住宿</span>
          </div></el-col>
        </el-row>
      </el-tab-pane>
      <el-tab-pane label="城市" name="second">
        <el-row>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>胡志明市</el-link></div><span>5607家酒店</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>台南</el-link></div><span>583家酒店</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>高雄</el-link></div><span>332家酒店</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>古来</el-link></div><span>467家酒店</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>马尼拉</el-link></div><span>785家酒店</span>
          </div></el-col>
        </el-row>
        <el-row>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>曼谷</el-link></div><span>139家酒店</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>北京</el-link></div><span>248家酒店</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>上海</el-link></div><span>357家酒店</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>杭州</el-link></div><span>447家酒店</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>南京</el-link></div><span>556家酒店</span>
          </div></el-col>
        </el-row>
        <el-row>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>小笨珍</el-link></div><span>211家酒店</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>麻坡</el-link></div><span>322家酒店</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>里加</el-link></div><span>73家酒店</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>合艾</el-link></div><span>4家酒店</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>布拉格</el-link></div><span>251家酒店</span>
          </div></el-col>
        </el-row>
      </el-tab-pane>
      <el-tab-pane label="周边地标/景点" name="third">
        <el-row>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>吉隆坡中央车站</el-link></div><span>4226家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>香港迪士尼乐园</el-link></div><span>343家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>云顶高原</el-link></div><span>655家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>四面佛</el-link></div><span>423家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>公主港</el-link></div><span>51家住宿</span>
          </div></el-col>
        </el-row>
        <el-row>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>上海迪士尼乐园</el-link></div><span>1321家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>浅水湾</el-link></div><span>223家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>第一世界广场</el-link></div><span>398家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>奥兰多迪士尼乐园</el-link></div><span>424家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>双威水上乐园</el-link></div><span>521家住宿</span>
          </div></el-col>
        </el-row>
        <el-row>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>马来西亚乐高乐园</el-link></div><span>12家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>台中火车站</el-link></div><span>237家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>台北车站</el-link></div><span>328家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>新关仔角</el-link></div><span>487家住宿</span>
          </div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple-light">
            <div><el-link>逢甲夜市</el-link></div><span>580家住宿</span>
          </div></el-col>
        </el-row>
      </el-tab-pane>
    </el-tabs>
  </div>
</template>
<script>
export default {
  data() {
    return {
      activeName: 'first'
    };
  },
  methods: {
    handleClick(tab, event) {
      console.log(tab, event);
    }
  }
};
</script>

<style scoped>
.bg-purple-light{
  background-color: white;
}
</style>