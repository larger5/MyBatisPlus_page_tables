package com.cun.app.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.cun.app.entity.Question;
import com.cun.app.vo.QuestionStudentVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author linhongcun
 * @since 2018-08-03
 */
public interface QuestionMapper extends BaseMapper<Question> {
    /**
     *
     * @param page 翻页对象，可以作为 xml 参数直接使用，传递参数 Page 即自动分页
     * @return
     */
    @Select("SELECT t_question.*,t_student.`name` FROM t_question,t_student WHERE t_question.student_id=t_student.id")
    List<QuestionStudentVO> getQuestionStudent(Pagination page);

}
