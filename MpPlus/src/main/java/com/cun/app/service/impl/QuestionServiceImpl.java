package com.cun.app.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cun.app.entity.Question;
import com.cun.app.mapper.QuestionMapper;
import com.cun.app.service.QuestionService;
import com.cun.app.vo.QuestionStudentVO;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author linhongcun
 * @since 2018-08-03
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService {

    @Override
    public Page<QuestionStudentVO> getQuestionStudent(Page<QuestionStudentVO> page) {
        return page.setRecords(this.baseMapper.getQuestionStudent(page));
    }

}
