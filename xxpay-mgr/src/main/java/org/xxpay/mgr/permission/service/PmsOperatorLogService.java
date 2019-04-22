package org.xxpay.mgr.permission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xxpay.dal.dao.mapper.PmsOperatorLogMapper;
import org.xxpay.dal.dao.model.PmsOperatorLog;

import java.util.HashMap;
import java.util.Map;

@Component
public class PmsOperatorLogService {
    @Autowired
    private PmsOperatorLogMapper pmsOperatorLogDao;

    /**
     * 创建pmsOperator
     */
    public void saveData(PmsOperatorLog pmsOperatorLog) {
        pmsOperatorLogDao.insert(pmsOperatorLog);
    }

    /**
     * 修改pmsOperator
     */
    public void updateData(PmsOperatorLog pmsOperatorLog) {
        pmsOperatorLogDao.updateByPrimaryKeySelective(pmsOperatorLog);
    }

    /**
     * 根据id获取数据pmsOperator
     *
     * @param id
     * @return
     */
    public PmsOperatorLog getDataById(Long id) {
        return pmsOperatorLogDao.selectByPrimaryKey(id);

    }

    /**
     * 分页查询pmsOperator
     *
     * @param pageParam
     * @param ActivityVo
     *            PmsOperator
     * @return
     */
    public PageBean listPage(PageParam pageParam, PmsOperatorLog pmsOperatorLog) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        return pmsOperatorLogDao.listPage(pageParam, paramMap);
    }
}
