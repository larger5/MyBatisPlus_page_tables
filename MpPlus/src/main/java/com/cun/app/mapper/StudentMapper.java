package com.cun.app.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.cun.app.entity.Student;
import com.cun.app.vo.QuestionStudentVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author linhongcun
 * @since 2018-08-03
 */
public interface StudentMapper extends BaseMapper<Student> {
}
