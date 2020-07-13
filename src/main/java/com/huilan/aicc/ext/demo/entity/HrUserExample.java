package com.huilan.aicc.ext.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HrUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HrUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openId is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openId is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openId =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openId <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openId >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openId >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openId <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openId <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openId like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openId not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openId in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openId not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openId between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openId not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("usertype is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("usertype is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Integer value) {
            addCriterion("usertype =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Integer value) {
            addCriterion("usertype <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Integer value) {
            addCriterion("usertype >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("usertype >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Integer value) {
            addCriterion("usertype <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("usertype <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Integer> values) {
            addCriterion("usertype in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Integer> values) {
            addCriterion("usertype not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("usertype between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("usertype not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Integer value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Integer value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Integer value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Integer value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Integer> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Integer> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andExtend1IsNull() {
            addCriterion("extend_1 is null");
            return (Criteria) this;
        }

        public Criteria andExtend1IsNotNull() {
            addCriterion("extend_1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend1EqualTo(String value) {
            addCriterion("extend_1 =", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotEqualTo(String value) {
            addCriterion("extend_1 <>", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1GreaterThan(String value) {
            addCriterion("extend_1 >", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1GreaterThanOrEqualTo(String value) {
            addCriterion("extend_1 >=", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1LessThan(String value) {
            addCriterion("extend_1 <", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1LessThanOrEqualTo(String value) {
            addCriterion("extend_1 <=", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1Like(String value) {
            addCriterion("extend_1 like", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotLike(String value) {
            addCriterion("extend_1 not like", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1In(List<String> values) {
            addCriterion("extend_1 in", values, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotIn(List<String> values) {
            addCriterion("extend_1 not in", values, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1Between(String value1, String value2) {
            addCriterion("extend_1 between", value1, value2, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotBetween(String value1, String value2) {
            addCriterion("extend_1 not between", value1, value2, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend2IsNull() {
            addCriterion("extend_2 is null");
            return (Criteria) this;
        }

        public Criteria andExtend2IsNotNull() {
            addCriterion("extend_2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend2EqualTo(String value) {
            addCriterion("extend_2 =", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotEqualTo(String value) {
            addCriterion("extend_2 <>", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2GreaterThan(String value) {
            addCriterion("extend_2 >", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2GreaterThanOrEqualTo(String value) {
            addCriterion("extend_2 >=", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2LessThan(String value) {
            addCriterion("extend_2 <", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2LessThanOrEqualTo(String value) {
            addCriterion("extend_2 <=", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2Like(String value) {
            addCriterion("extend_2 like", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotLike(String value) {
            addCriterion("extend_2 not like", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2In(List<String> values) {
            addCriterion("extend_2 in", values, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotIn(List<String> values) {
            addCriterion("extend_2 not in", values, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2Between(String value1, String value2) {
            addCriterion("extend_2 between", value1, value2, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotBetween(String value1, String value2) {
            addCriterion("extend_2 not between", value1, value2, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend3IsNull() {
            addCriterion("extend_3 is null");
            return (Criteria) this;
        }

        public Criteria andExtend3IsNotNull() {
            addCriterion("extend_3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend3EqualTo(String value) {
            addCriterion("extend_3 =", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotEqualTo(String value) {
            addCriterion("extend_3 <>", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3GreaterThan(String value) {
            addCriterion("extend_3 >", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3GreaterThanOrEqualTo(String value) {
            addCriterion("extend_3 >=", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3LessThan(String value) {
            addCriterion("extend_3 <", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3LessThanOrEqualTo(String value) {
            addCriterion("extend_3 <=", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3Like(String value) {
            addCriterion("extend_3 like", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotLike(String value) {
            addCriterion("extend_3 not like", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3In(List<String> values) {
            addCriterion("extend_3 in", values, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotIn(List<String> values) {
            addCriterion("extend_3 not in", values, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3Between(String value1, String value2) {
            addCriterion("extend_3 between", value1, value2, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotBetween(String value1, String value2) {
            addCriterion("extend_3 not between", value1, value2, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend4IsNull() {
            addCriterion("extend_4 is null");
            return (Criteria) this;
        }

        public Criteria andExtend4IsNotNull() {
            addCriterion("extend_4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend4EqualTo(String value) {
            addCriterion("extend_4 =", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4NotEqualTo(String value) {
            addCriterion("extend_4 <>", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4GreaterThan(String value) {
            addCriterion("extend_4 >", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4GreaterThanOrEqualTo(String value) {
            addCriterion("extend_4 >=", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4LessThan(String value) {
            addCriterion("extend_4 <", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4LessThanOrEqualTo(String value) {
            addCriterion("extend_4 <=", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4Like(String value) {
            addCriterion("extend_4 like", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4NotLike(String value) {
            addCriterion("extend_4 not like", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4In(List<String> values) {
            addCriterion("extend_4 in", values, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4NotIn(List<String> values) {
            addCriterion("extend_4 not in", values, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4Between(String value1, String value2) {
            addCriterion("extend_4 between", value1, value2, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4NotBetween(String value1, String value2) {
            addCriterion("extend_4 not between", value1, value2, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend5IsNull() {
            addCriterion("extend_5 is null");
            return (Criteria) this;
        }

        public Criteria andExtend5IsNotNull() {
            addCriterion("extend_5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend5EqualTo(String value) {
            addCriterion("extend_5 =", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5NotEqualTo(String value) {
            addCriterion("extend_5 <>", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5GreaterThan(String value) {
            addCriterion("extend_5 >", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5GreaterThanOrEqualTo(String value) {
            addCriterion("extend_5 >=", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5LessThan(String value) {
            addCriterion("extend_5 <", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5LessThanOrEqualTo(String value) {
            addCriterion("extend_5 <=", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5Like(String value) {
            addCriterion("extend_5 like", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5NotLike(String value) {
            addCriterion("extend_5 not like", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5In(List<String> values) {
            addCriterion("extend_5 in", values, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5NotIn(List<String> values) {
            addCriterion("extend_5 not in", values, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5Between(String value1, String value2) {
            addCriterion("extend_5 between", value1, value2, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5NotBetween(String value1, String value2) {
            addCriterion("extend_5 not between", value1, value2, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend6IsNull() {
            addCriterion("extend_6 is null");
            return (Criteria) this;
        }

        public Criteria andExtend6IsNotNull() {
            addCriterion("extend_6 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend6EqualTo(String value) {
            addCriterion("extend_6 =", value, "extend6");
            return (Criteria) this;
        }

        public Criteria andExtend6NotEqualTo(String value) {
            addCriterion("extend_6 <>", value, "extend6");
            return (Criteria) this;
        }

        public Criteria andExtend6GreaterThan(String value) {
            addCriterion("extend_6 >", value, "extend6");
            return (Criteria) this;
        }

        public Criteria andExtend6GreaterThanOrEqualTo(String value) {
            addCriterion("extend_6 >=", value, "extend6");
            return (Criteria) this;
        }

        public Criteria andExtend6LessThan(String value) {
            addCriterion("extend_6 <", value, "extend6");
            return (Criteria) this;
        }

        public Criteria andExtend6LessThanOrEqualTo(String value) {
            addCriterion("extend_6 <=", value, "extend6");
            return (Criteria) this;
        }

        public Criteria andExtend6Like(String value) {
            addCriterion("extend_6 like", value, "extend6");
            return (Criteria) this;
        }

        public Criteria andExtend6NotLike(String value) {
            addCriterion("extend_6 not like", value, "extend6");
            return (Criteria) this;
        }

        public Criteria andExtend6In(List<String> values) {
            addCriterion("extend_6 in", values, "extend6");
            return (Criteria) this;
        }

        public Criteria andExtend6NotIn(List<String> values) {
            addCriterion("extend_6 not in", values, "extend6");
            return (Criteria) this;
        }

        public Criteria andExtend6Between(String value1, String value2) {
            addCriterion("extend_6 between", value1, value2, "extend6");
            return (Criteria) this;
        }

        public Criteria andExtend6NotBetween(String value1, String value2) {
            addCriterion("extend_6 not between", value1, value2, "extend6");
            return (Criteria) this;
        }

        public Criteria andExtend7IsNull() {
            addCriterion("extend_7 is null");
            return (Criteria) this;
        }

        public Criteria andExtend7IsNotNull() {
            addCriterion("extend_7 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend7EqualTo(String value) {
            addCriterion("extend_7 =", value, "extend7");
            return (Criteria) this;
        }

        public Criteria andExtend7NotEqualTo(String value) {
            addCriterion("extend_7 <>", value, "extend7");
            return (Criteria) this;
        }

        public Criteria andExtend7GreaterThan(String value) {
            addCriterion("extend_7 >", value, "extend7");
            return (Criteria) this;
        }

        public Criteria andExtend7GreaterThanOrEqualTo(String value) {
            addCriterion("extend_7 >=", value, "extend7");
            return (Criteria) this;
        }

        public Criteria andExtend7LessThan(String value) {
            addCriterion("extend_7 <", value, "extend7");
            return (Criteria) this;
        }

        public Criteria andExtend7LessThanOrEqualTo(String value) {
            addCriterion("extend_7 <=", value, "extend7");
            return (Criteria) this;
        }

        public Criteria andExtend7Like(String value) {
            addCriterion("extend_7 like", value, "extend7");
            return (Criteria) this;
        }

        public Criteria andExtend7NotLike(String value) {
            addCriterion("extend_7 not like", value, "extend7");
            return (Criteria) this;
        }

        public Criteria andExtend7In(List<String> values) {
            addCriterion("extend_7 in", values, "extend7");
            return (Criteria) this;
        }

        public Criteria andExtend7NotIn(List<String> values) {
            addCriterion("extend_7 not in", values, "extend7");
            return (Criteria) this;
        }

        public Criteria andExtend7Between(String value1, String value2) {
            addCriterion("extend_7 between", value1, value2, "extend7");
            return (Criteria) this;
        }

        public Criteria andExtend7NotBetween(String value1, String value2) {
            addCriterion("extend_7 not between", value1, value2, "extend7");
            return (Criteria) this;
        }

        public Criteria andExtend8IsNull() {
            addCriterion("extend_8 is null");
            return (Criteria) this;
        }

        public Criteria andExtend8IsNotNull() {
            addCriterion("extend_8 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend8EqualTo(String value) {
            addCriterion("extend_8 =", value, "extend8");
            return (Criteria) this;
        }

        public Criteria andExtend8NotEqualTo(String value) {
            addCriterion("extend_8 <>", value, "extend8");
            return (Criteria) this;
        }

        public Criteria andExtend8GreaterThan(String value) {
            addCriterion("extend_8 >", value, "extend8");
            return (Criteria) this;
        }

        public Criteria andExtend8GreaterThanOrEqualTo(String value) {
            addCriterion("extend_8 >=", value, "extend8");
            return (Criteria) this;
        }

        public Criteria andExtend8LessThan(String value) {
            addCriterion("extend_8 <", value, "extend8");
            return (Criteria) this;
        }

        public Criteria andExtend8LessThanOrEqualTo(String value) {
            addCriterion("extend_8 <=", value, "extend8");
            return (Criteria) this;
        }

        public Criteria andExtend8Like(String value) {
            addCriterion("extend_8 like", value, "extend8");
            return (Criteria) this;
        }

        public Criteria andExtend8NotLike(String value) {
            addCriterion("extend_8 not like", value, "extend8");
            return (Criteria) this;
        }

        public Criteria andExtend8In(List<String> values) {
            addCriterion("extend_8 in", values, "extend8");
            return (Criteria) this;
        }

        public Criteria andExtend8NotIn(List<String> values) {
            addCriterion("extend_8 not in", values, "extend8");
            return (Criteria) this;
        }

        public Criteria andExtend8Between(String value1, String value2) {
            addCriterion("extend_8 between", value1, value2, "extend8");
            return (Criteria) this;
        }

        public Criteria andExtend8NotBetween(String value1, String value2) {
            addCriterion("extend_8 not between", value1, value2, "extend8");
            return (Criteria) this;
        }

        public Criteria andExtend9IsNull() {
            addCriterion("extend_9 is null");
            return (Criteria) this;
        }

        public Criteria andExtend9IsNotNull() {
            addCriterion("extend_9 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend9EqualTo(String value) {
            addCriterion("extend_9 =", value, "extend9");
            return (Criteria) this;
        }

        public Criteria andExtend9NotEqualTo(String value) {
            addCriterion("extend_9 <>", value, "extend9");
            return (Criteria) this;
        }

        public Criteria andExtend9GreaterThan(String value) {
            addCriterion("extend_9 >", value, "extend9");
            return (Criteria) this;
        }

        public Criteria andExtend9GreaterThanOrEqualTo(String value) {
            addCriterion("extend_9 >=", value, "extend9");
            return (Criteria) this;
        }

        public Criteria andExtend9LessThan(String value) {
            addCriterion("extend_9 <", value, "extend9");
            return (Criteria) this;
        }

        public Criteria andExtend9LessThanOrEqualTo(String value) {
            addCriterion("extend_9 <=", value, "extend9");
            return (Criteria) this;
        }

        public Criteria andExtend9Like(String value) {
            addCriterion("extend_9 like", value, "extend9");
            return (Criteria) this;
        }

        public Criteria andExtend9NotLike(String value) {
            addCriterion("extend_9 not like", value, "extend9");
            return (Criteria) this;
        }

        public Criteria andExtend9In(List<String> values) {
            addCriterion("extend_9 in", values, "extend9");
            return (Criteria) this;
        }

        public Criteria andExtend9NotIn(List<String> values) {
            addCriterion("extend_9 not in", values, "extend9");
            return (Criteria) this;
        }

        public Criteria andExtend9Between(String value1, String value2) {
            addCriterion("extend_9 between", value1, value2, "extend9");
            return (Criteria) this;
        }

        public Criteria andExtend9NotBetween(String value1, String value2) {
            addCriterion("extend_9 not between", value1, value2, "extend9");
            return (Criteria) this;
        }

        public Criteria andExtend10IsNull() {
            addCriterion("extend_10 is null");
            return (Criteria) this;
        }

        public Criteria andExtend10IsNotNull() {
            addCriterion("extend_10 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend10EqualTo(String value) {
            addCriterion("extend_10 =", value, "extend10");
            return (Criteria) this;
        }

        public Criteria andExtend10NotEqualTo(String value) {
            addCriterion("extend_10 <>", value, "extend10");
            return (Criteria) this;
        }

        public Criteria andExtend10GreaterThan(String value) {
            addCriterion("extend_10 >", value, "extend10");
            return (Criteria) this;
        }

        public Criteria andExtend10GreaterThanOrEqualTo(String value) {
            addCriterion("extend_10 >=", value, "extend10");
            return (Criteria) this;
        }

        public Criteria andExtend10LessThan(String value) {
            addCriterion("extend_10 <", value, "extend10");
            return (Criteria) this;
        }

        public Criteria andExtend10LessThanOrEqualTo(String value) {
            addCriterion("extend_10 <=", value, "extend10");
            return (Criteria) this;
        }

        public Criteria andExtend10Like(String value) {
            addCriterion("extend_10 like", value, "extend10");
            return (Criteria) this;
        }

        public Criteria andExtend10NotLike(String value) {
            addCriterion("extend_10 not like", value, "extend10");
            return (Criteria) this;
        }

        public Criteria andExtend10In(List<String> values) {
            addCriterion("extend_10 in", values, "extend10");
            return (Criteria) this;
        }

        public Criteria andExtend10NotIn(List<String> values) {
            addCriterion("extend_10 not in", values, "extend10");
            return (Criteria) this;
        }

        public Criteria andExtend10Between(String value1, String value2) {
            addCriterion("extend_10 between", value1, value2, "extend10");
            return (Criteria) this;
        }

        public Criteria andExtend10NotBetween(String value1, String value2) {
            addCriterion("extend_10 not between", value1, value2, "extend10");
            return (Criteria) this;
        }

        public Criteria andExtend11IsNull() {
            addCriterion("extend_11 is null");
            return (Criteria) this;
        }

        public Criteria andExtend11IsNotNull() {
            addCriterion("extend_11 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend11EqualTo(String value) {
            addCriterion("extend_11 =", value, "extend11");
            return (Criteria) this;
        }

        public Criteria andExtend11NotEqualTo(String value) {
            addCriterion("extend_11 <>", value, "extend11");
            return (Criteria) this;
        }

        public Criteria andExtend11GreaterThan(String value) {
            addCriterion("extend_11 >", value, "extend11");
            return (Criteria) this;
        }

        public Criteria andExtend11GreaterThanOrEqualTo(String value) {
            addCriterion("extend_11 >=", value, "extend11");
            return (Criteria) this;
        }

        public Criteria andExtend11LessThan(String value) {
            addCriterion("extend_11 <", value, "extend11");
            return (Criteria) this;
        }

        public Criteria andExtend11LessThanOrEqualTo(String value) {
            addCriterion("extend_11 <=", value, "extend11");
            return (Criteria) this;
        }

        public Criteria andExtend11Like(String value) {
            addCriterion("extend_11 like", value, "extend11");
            return (Criteria) this;
        }

        public Criteria andExtend11NotLike(String value) {
            addCriterion("extend_11 not like", value, "extend11");
            return (Criteria) this;
        }

        public Criteria andExtend11In(List<String> values) {
            addCriterion("extend_11 in", values, "extend11");
            return (Criteria) this;
        }

        public Criteria andExtend11NotIn(List<String> values) {
            addCriterion("extend_11 not in", values, "extend11");
            return (Criteria) this;
        }

        public Criteria andExtend11Between(String value1, String value2) {
            addCriterion("extend_11 between", value1, value2, "extend11");
            return (Criteria) this;
        }

        public Criteria andExtend11NotBetween(String value1, String value2) {
            addCriterion("extend_11 not between", value1, value2, "extend11");
            return (Criteria) this;
        }

        public Criteria andExtend12IsNull() {
            addCriterion("extend_12 is null");
            return (Criteria) this;
        }

        public Criteria andExtend12IsNotNull() {
            addCriterion("extend_12 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend12EqualTo(String value) {
            addCriterion("extend_12 =", value, "extend12");
            return (Criteria) this;
        }

        public Criteria andExtend12NotEqualTo(String value) {
            addCriterion("extend_12 <>", value, "extend12");
            return (Criteria) this;
        }

        public Criteria andExtend12GreaterThan(String value) {
            addCriterion("extend_12 >", value, "extend12");
            return (Criteria) this;
        }

        public Criteria andExtend12GreaterThanOrEqualTo(String value) {
            addCriterion("extend_12 >=", value, "extend12");
            return (Criteria) this;
        }

        public Criteria andExtend12LessThan(String value) {
            addCriterion("extend_12 <", value, "extend12");
            return (Criteria) this;
        }

        public Criteria andExtend12LessThanOrEqualTo(String value) {
            addCriterion("extend_12 <=", value, "extend12");
            return (Criteria) this;
        }

        public Criteria andExtend12Like(String value) {
            addCriterion("extend_12 like", value, "extend12");
            return (Criteria) this;
        }

        public Criteria andExtend12NotLike(String value) {
            addCriterion("extend_12 not like", value, "extend12");
            return (Criteria) this;
        }

        public Criteria andExtend12In(List<String> values) {
            addCriterion("extend_12 in", values, "extend12");
            return (Criteria) this;
        }

        public Criteria andExtend12NotIn(List<String> values) {
            addCriterion("extend_12 not in", values, "extend12");
            return (Criteria) this;
        }

        public Criteria andExtend12Between(String value1, String value2) {
            addCriterion("extend_12 between", value1, value2, "extend12");
            return (Criteria) this;
        }

        public Criteria andExtend12NotBetween(String value1, String value2) {
            addCriterion("extend_12 not between", value1, value2, "extend12");
            return (Criteria) this;
        }

        public Criteria andExtend13IsNull() {
            addCriterion("extend_13 is null");
            return (Criteria) this;
        }

        public Criteria andExtend13IsNotNull() {
            addCriterion("extend_13 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend13EqualTo(String value) {
            addCriterion("extend_13 =", value, "extend13");
            return (Criteria) this;
        }

        public Criteria andExtend13NotEqualTo(String value) {
            addCriterion("extend_13 <>", value, "extend13");
            return (Criteria) this;
        }

        public Criteria andExtend13GreaterThan(String value) {
            addCriterion("extend_13 >", value, "extend13");
            return (Criteria) this;
        }

        public Criteria andExtend13GreaterThanOrEqualTo(String value) {
            addCriterion("extend_13 >=", value, "extend13");
            return (Criteria) this;
        }

        public Criteria andExtend13LessThan(String value) {
            addCriterion("extend_13 <", value, "extend13");
            return (Criteria) this;
        }

        public Criteria andExtend13LessThanOrEqualTo(String value) {
            addCriterion("extend_13 <=", value, "extend13");
            return (Criteria) this;
        }

        public Criteria andExtend13Like(String value) {
            addCriterion("extend_13 like", value, "extend13");
            return (Criteria) this;
        }

        public Criteria andExtend13NotLike(String value) {
            addCriterion("extend_13 not like", value, "extend13");
            return (Criteria) this;
        }

        public Criteria andExtend13In(List<String> values) {
            addCriterion("extend_13 in", values, "extend13");
            return (Criteria) this;
        }

        public Criteria andExtend13NotIn(List<String> values) {
            addCriterion("extend_13 not in", values, "extend13");
            return (Criteria) this;
        }

        public Criteria andExtend13Between(String value1, String value2) {
            addCriterion("extend_13 between", value1, value2, "extend13");
            return (Criteria) this;
        }

        public Criteria andExtend13NotBetween(String value1, String value2) {
            addCriterion("extend_13 not between", value1, value2, "extend13");
            return (Criteria) this;
        }

        public Criteria andExtend14IsNull() {
            addCriterion("extend_14 is null");
            return (Criteria) this;
        }

        public Criteria andExtend14IsNotNull() {
            addCriterion("extend_14 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend14EqualTo(String value) {
            addCriterion("extend_14 =", value, "extend14");
            return (Criteria) this;
        }

        public Criteria andExtend14NotEqualTo(String value) {
            addCriterion("extend_14 <>", value, "extend14");
            return (Criteria) this;
        }

        public Criteria andExtend14GreaterThan(String value) {
            addCriterion("extend_14 >", value, "extend14");
            return (Criteria) this;
        }

        public Criteria andExtend14GreaterThanOrEqualTo(String value) {
            addCriterion("extend_14 >=", value, "extend14");
            return (Criteria) this;
        }

        public Criteria andExtend14LessThan(String value) {
            addCriterion("extend_14 <", value, "extend14");
            return (Criteria) this;
        }

        public Criteria andExtend14LessThanOrEqualTo(String value) {
            addCriterion("extend_14 <=", value, "extend14");
            return (Criteria) this;
        }

        public Criteria andExtend14Like(String value) {
            addCriterion("extend_14 like", value, "extend14");
            return (Criteria) this;
        }

        public Criteria andExtend14NotLike(String value) {
            addCriterion("extend_14 not like", value, "extend14");
            return (Criteria) this;
        }

        public Criteria andExtend14In(List<String> values) {
            addCriterion("extend_14 in", values, "extend14");
            return (Criteria) this;
        }

        public Criteria andExtend14NotIn(List<String> values) {
            addCriterion("extend_14 not in", values, "extend14");
            return (Criteria) this;
        }

        public Criteria andExtend14Between(String value1, String value2) {
            addCriterion("extend_14 between", value1, value2, "extend14");
            return (Criteria) this;
        }

        public Criteria andExtend14NotBetween(String value1, String value2) {
            addCriterion("extend_14 not between", value1, value2, "extend14");
            return (Criteria) this;
        }

        public Criteria andExtend15IsNull() {
            addCriterion("extend_15 is null");
            return (Criteria) this;
        }

        public Criteria andExtend15IsNotNull() {
            addCriterion("extend_15 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend15EqualTo(String value) {
            addCriterion("extend_15 =", value, "extend15");
            return (Criteria) this;
        }

        public Criteria andExtend15NotEqualTo(String value) {
            addCriterion("extend_15 <>", value, "extend15");
            return (Criteria) this;
        }

        public Criteria andExtend15GreaterThan(String value) {
            addCriterion("extend_15 >", value, "extend15");
            return (Criteria) this;
        }

        public Criteria andExtend15GreaterThanOrEqualTo(String value) {
            addCriterion("extend_15 >=", value, "extend15");
            return (Criteria) this;
        }

        public Criteria andExtend15LessThan(String value) {
            addCriterion("extend_15 <", value, "extend15");
            return (Criteria) this;
        }

        public Criteria andExtend15LessThanOrEqualTo(String value) {
            addCriterion("extend_15 <=", value, "extend15");
            return (Criteria) this;
        }

        public Criteria andExtend15Like(String value) {
            addCriterion("extend_15 like", value, "extend15");
            return (Criteria) this;
        }

        public Criteria andExtend15NotLike(String value) {
            addCriterion("extend_15 not like", value, "extend15");
            return (Criteria) this;
        }

        public Criteria andExtend15In(List<String> values) {
            addCriterion("extend_15 in", values, "extend15");
            return (Criteria) this;
        }

        public Criteria andExtend15NotIn(List<String> values) {
            addCriterion("extend_15 not in", values, "extend15");
            return (Criteria) this;
        }

        public Criteria andExtend15Between(String value1, String value2) {
            addCriterion("extend_15 between", value1, value2, "extend15");
            return (Criteria) this;
        }

        public Criteria andExtend15NotBetween(String value1, String value2) {
            addCriterion("extend_15 not between", value1, value2, "extend15");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}