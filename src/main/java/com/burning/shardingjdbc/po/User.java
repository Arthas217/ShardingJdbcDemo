package com.burning.shardingjdbc.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 会游泳的蚂蚁
 * @description:
 * @date 2023/12/16 09:59
 */
@Data
@TableName("t_user")
/*不加注释报错
  ### SQL: INSERT INTO user  ( user_name, status )  VALUES (  ?, ?  )
  ### Cause: java.lang.IllegalStateException: Missing the data source name: 'null'
*/
public class User {
    private Long userId;
    private String userName;
    private String status;
}
