package excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: hhp
 * Date: 2022/6/9
 * Time: 21:51
 * Description: No Description
 */
@Data
public class DemoData {
    //设置表头
    @ExcelProperty(value = "学生编号",index = 0)
    private  Integer sno;
    @ExcelProperty(value = "学生姓名",index = 1)
    private String sname;
}
