<template>
  <el-card style="z-index: 1000; position: fixed; top:20%;left: 15%; width: 70%; height: 600px">
    <div>
        <span style="font-size: 25px">选择币种</span><br><br>
        <span>适用价格将转换为你所选的货币并以该货币显示。
          支付时所使用的货币可能根据你的预订而有所不同，且还可能产生服务费。</span><br><br>
    </div>
    <div>
        <el-table
            :data="table1Data"
            border
            style="width: 600px; border: 1px solid white;">
          <el-table-column label="列1" width="150">
            <template >
              <el-button
                  :round="true"
                  style="width: 150px; height: 75px;">
                <div style="text-align: center;">
                  <div>Label 1</div>
                  <div>Value 1</div>
                </div>
              </el-button>
            </template>
          </el-table-column>
          <el-table-column label="列2" width="150">
            <template >
              <el-button
                  :round="true"
                  style="width: 150px; height: 75px;">
                <div style="text-align: center;">
                  <div>Label 2</div>
                  <div>Value 2</div>
                </div>
              </el-button>
            </template>
          </el-table-column>
          <el-table-column label="列3" width="150">
            <template >
              <el-button
                  :round="true"
                  style="width: 150px; height: 75px;">
                <div style="text-align: center;">
                  <div>Label 3</div>
                  <div>Value 3</div>
                </div>
              </el-button>
            </template>
          </el-table-column>
          <el-table-column label="列4" width="150">
            <template >
              <el-button
                  :round="true"
                  style="width: 150px; height: 75px;">
                <div style="text-align: center;">
                  <div>Label 4</div>
                  <div>Value 4</div>
                </div>
              </el-button>
            </template>
          </el-table-column>
        </el-table>

        <el-table
            :data="table2Data"
            border
            style="width: 600px; border: 1px solid white;">
          <el-table-column label="列1" width="150">
            <template >
              <el-button
                  :round="true"
                  style="width: 150px; height: 75px;">
                <div style="text-align: center;">
                  <div>Label 1</div>
                  <div>Value 1</div>
                </div>
              </el-button>
            </template>
          </el-table-column>
          <el-table-column label="列2" width="150">
            <template >
              <el-button
                  :round="true"
                  style="width: 150px; height: 75px;">
                <div style="text-align: center;">
                  <div>Label 2</div>
                  <div>Value 2</div>
                </div>
              </el-button>
            </template>
          </el-table-column>
          <el-table-column label="列3" width="150">
            <template >
              <el-button
                  :round="true"
                  style="width: 150px; height: 75px;">
                <div style="text-align: center;">
                  <div>Label 3</div>
                  <div>Value 3</div>
                </div>
              </el-button>
            </template>
          </el-table-column>
          <el-table-column label="列4" width="150">
            <template >
              <el-button
                  :round="true"
                  style="width: 150px; height: 75px;">
                <div style="text-align: center;">
                  <div>Label 4</div>
                  <div>Value 4</div>
                </div>
              </el-button>
            </template>
          </el-table-column>
        </el-table>
      </div>
  </el-card>
</template>

    <script>
      export default {
        data() {
          return {
            table1Data: Array.from({ length: 2 }, (_, index) => ({
              id: index
            })),
            table2Data: Array.from({ length: 6 }, (_, index) => ({
              id: index
            }))
          };
        }
      };
    </script>
