package com.cun.app.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.cun.app.entity.Question;
import com.cun.app.vo.QuestionStudentVO;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author linhongcun
 * @since 2018-08-03
 */
public interface QuestionService extends IService<Question> {

    Page<QuestionStudentVO> getQuestionStudent(Page<QuestionStudentVO> page);

}
