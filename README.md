# excel_formula
excel公式（excel公式计算 包含 加减乘除 负号 单个百分号 IF AND OR MIN MAX SUM RANK ABS）
代码核心点：
1、公式计算： 分析字符串，转换成后缀表达式，方便用栈进行计算，分析是符号类型或者是数值类型。
  符号类型 包括： 
    1）基础类型：加减乘除。
    2）函数：IF(,AND(, OR(, MIN(, MAX(, SUM(, RANK(，ABS(。 外加：-(，即负号。
    3）其他：逗号，冒号。
  数值类型 包括：
    1）普通数值：number 或者 50%（百分号形式）。
    2）单元格名称：字母加数字，例如：F2。（目前仅支持单个字母）。
2、单元格 迭代计算：采用递归，为了避免死循环，加入了个变量，当遍历次数达到阈值则结束，并返回循环错误赋值给该单元格。
