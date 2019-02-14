package com.example.bean;

import java.util.ArrayList;
import java.util.List;

public class PlayerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayerExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(Integer value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(Integer value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(Integer value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(Integer value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(Integer value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(Integer value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<Integer> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<Integer> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(Integer value1, Integer value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(Integer value1, Integer value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andMaxfightpowerIsNull() {
            addCriterion("maxFightPower is null");
            return (Criteria) this;
        }

        public Criteria andMaxfightpowerIsNotNull() {
            addCriterion("maxFightPower is not null");
            return (Criteria) this;
        }

        public Criteria andMaxfightpowerEqualTo(Integer value) {
            addCriterion("maxFightPower =", value, "maxfightpower");
            return (Criteria) this;
        }

        public Criteria andMaxfightpowerNotEqualTo(Integer value) {
            addCriterion("maxFightPower <>", value, "maxfightpower");
            return (Criteria) this;
        }

        public Criteria andMaxfightpowerGreaterThan(Integer value) {
            addCriterion("maxFightPower >", value, "maxfightpower");
            return (Criteria) this;
        }

        public Criteria andMaxfightpowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxFightPower >=", value, "maxfightpower");
            return (Criteria) this;
        }

        public Criteria andMaxfightpowerLessThan(Integer value) {
            addCriterion("maxFightPower <", value, "maxfightpower");
            return (Criteria) this;
        }

        public Criteria andMaxfightpowerLessThanOrEqualTo(Integer value) {
            addCriterion("maxFightPower <=", value, "maxfightpower");
            return (Criteria) this;
        }

        public Criteria andMaxfightpowerIn(List<Integer> values) {
            addCriterion("maxFightPower in", values, "maxfightpower");
            return (Criteria) this;
        }

        public Criteria andMaxfightpowerNotIn(List<Integer> values) {
            addCriterion("maxFightPower not in", values, "maxfightpower");
            return (Criteria) this;
        }

        public Criteria andMaxfightpowerBetween(Integer value1, Integer value2) {
            addCriterion("maxFightPower between", value1, value2, "maxfightpower");
            return (Criteria) this;
        }

        public Criteria andMaxfightpowerNotBetween(Integer value1, Integer value2) {
            addCriterion("maxFightPower not between", value1, value2, "maxfightpower");
            return (Criteria) this;
        }

        public Criteria andGmlevelIsNull() {
            addCriterion("gmLevel is null");
            return (Criteria) this;
        }

        public Criteria andGmlevelIsNotNull() {
            addCriterion("gmLevel is not null");
            return (Criteria) this;
        }

        public Criteria andGmlevelEqualTo(Integer value) {
            addCriterion("gmLevel =", value, "gmlevel");
            return (Criteria) this;
        }

        public Criteria andGmlevelNotEqualTo(Integer value) {
            addCriterion("gmLevel <>", value, "gmlevel");
            return (Criteria) this;
        }

        public Criteria andGmlevelGreaterThan(Integer value) {
            addCriterion("gmLevel >", value, "gmlevel");
            return (Criteria) this;
        }

        public Criteria andGmlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("gmLevel >=", value, "gmlevel");
            return (Criteria) this;
        }

        public Criteria andGmlevelLessThan(Integer value) {
            addCriterion("gmLevel <", value, "gmlevel");
            return (Criteria) this;
        }

        public Criteria andGmlevelLessThanOrEqualTo(Integer value) {
            addCriterion("gmLevel <=", value, "gmlevel");
            return (Criteria) this;
        }

        public Criteria andGmlevelIn(List<Integer> values) {
            addCriterion("gmLevel in", values, "gmlevel");
            return (Criteria) this;
        }

        public Criteria andGmlevelNotIn(List<Integer> values) {
            addCriterion("gmLevel not in", values, "gmlevel");
            return (Criteria) this;
        }

        public Criteria andGmlevelBetween(Integer value1, Integer value2) {
            addCriterion("gmLevel between", value1, value2, "gmlevel");
            return (Criteria) this;
        }

        public Criteria andGmlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("gmLevel not between", value1, value2, "gmlevel");
            return (Criteria) this;
        }

        public Criteria andCheattimesIsNull() {
            addCriterion("cheatTimes is null");
            return (Criteria) this;
        }

        public Criteria andCheattimesIsNotNull() {
            addCriterion("cheatTimes is not null");
            return (Criteria) this;
        }

        public Criteria andCheattimesEqualTo(Integer value) {
            addCriterion("cheatTimes =", value, "cheattimes");
            return (Criteria) this;
        }

        public Criteria andCheattimesNotEqualTo(Integer value) {
            addCriterion("cheatTimes <>", value, "cheattimes");
            return (Criteria) this;
        }

        public Criteria andCheattimesGreaterThan(Integer value) {
            addCriterion("cheatTimes >", value, "cheattimes");
            return (Criteria) this;
        }

        public Criteria andCheattimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("cheatTimes >=", value, "cheattimes");
            return (Criteria) this;
        }

        public Criteria andCheattimesLessThan(Integer value) {
            addCriterion("cheatTimes <", value, "cheattimes");
            return (Criteria) this;
        }

        public Criteria andCheattimesLessThanOrEqualTo(Integer value) {
            addCriterion("cheatTimes <=", value, "cheattimes");
            return (Criteria) this;
        }

        public Criteria andCheattimesIn(List<Integer> values) {
            addCriterion("cheatTimes in", values, "cheattimes");
            return (Criteria) this;
        }

        public Criteria andCheattimesNotIn(List<Integer> values) {
            addCriterion("cheatTimes not in", values, "cheattimes");
            return (Criteria) this;
        }

        public Criteria andCheattimesBetween(Integer value1, Integer value2) {
            addCriterion("cheatTimes between", value1, value2, "cheattimes");
            return (Criteria) this;
        }

        public Criteria andCheattimesNotBetween(Integer value1, Integer value2) {
            addCriterion("cheatTimes not between", value1, value2, "cheattimes");
            return (Criteria) this;
        }

        public Criteria andBannedChatexpiredtimeIsNull() {
            addCriterion("banned_ChatExpiredTime is null");
            return (Criteria) this;
        }

        public Criteria andBannedChatexpiredtimeIsNotNull() {
            addCriterion("banned_ChatExpiredTime is not null");
            return (Criteria) this;
        }

        public Criteria andBannedChatexpiredtimeEqualTo(Integer value) {
            addCriterion("banned_ChatExpiredTime =", value, "bannedChatexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedChatexpiredtimeNotEqualTo(Integer value) {
            addCriterion("banned_ChatExpiredTime <>", value, "bannedChatexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedChatexpiredtimeGreaterThan(Integer value) {
            addCriterion("banned_ChatExpiredTime >", value, "bannedChatexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedChatexpiredtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("banned_ChatExpiredTime >=", value, "bannedChatexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedChatexpiredtimeLessThan(Integer value) {
            addCriterion("banned_ChatExpiredTime <", value, "bannedChatexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedChatexpiredtimeLessThanOrEqualTo(Integer value) {
            addCriterion("banned_ChatExpiredTime <=", value, "bannedChatexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedChatexpiredtimeIn(List<Integer> values) {
            addCriterion("banned_ChatExpiredTime in", values, "bannedChatexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedChatexpiredtimeNotIn(List<Integer> values) {
            addCriterion("banned_ChatExpiredTime not in", values, "bannedChatexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedChatexpiredtimeBetween(Integer value1, Integer value2) {
            addCriterion("banned_ChatExpiredTime between", value1, value2, "bannedChatexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedChatexpiredtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("banned_ChatExpiredTime not between", value1, value2, "bannedChatexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedLoginexpiredtimeIsNull() {
            addCriterion("banned_LoginExpiredTime is null");
            return (Criteria) this;
        }

        public Criteria andBannedLoginexpiredtimeIsNotNull() {
            addCriterion("banned_LoginExpiredTime is not null");
            return (Criteria) this;
        }

        public Criteria andBannedLoginexpiredtimeEqualTo(Integer value) {
            addCriterion("banned_LoginExpiredTime =", value, "bannedLoginexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedLoginexpiredtimeNotEqualTo(Integer value) {
            addCriterion("banned_LoginExpiredTime <>", value, "bannedLoginexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedLoginexpiredtimeGreaterThan(Integer value) {
            addCriterion("banned_LoginExpiredTime >", value, "bannedLoginexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedLoginexpiredtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("banned_LoginExpiredTime >=", value, "bannedLoginexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedLoginexpiredtimeLessThan(Integer value) {
            addCriterion("banned_LoginExpiredTime <", value, "bannedLoginexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedLoginexpiredtimeLessThanOrEqualTo(Integer value) {
            addCriterion("banned_LoginExpiredTime <=", value, "bannedLoginexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedLoginexpiredtimeIn(List<Integer> values) {
            addCriterion("banned_LoginExpiredTime in", values, "bannedLoginexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedLoginexpiredtimeNotIn(List<Integer> values) {
            addCriterion("banned_LoginExpiredTime not in", values, "bannedLoginexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedLoginexpiredtimeBetween(Integer value1, Integer value2) {
            addCriterion("banned_LoginExpiredTime between", value1, value2, "bannedLoginexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedLoginexpiredtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("banned_LoginExpiredTime not between", value1, value2, "bannedLoginexpiredtime");
            return (Criteria) this;
        }

        public Criteria andBannedtimesIsNull() {
            addCriterion("bannedTimes is null");
            return (Criteria) this;
        }

        public Criteria andBannedtimesIsNotNull() {
            addCriterion("bannedTimes is not null");
            return (Criteria) this;
        }

        public Criteria andBannedtimesEqualTo(Integer value) {
            addCriterion("bannedTimes =", value, "bannedtimes");
            return (Criteria) this;
        }

        public Criteria andBannedtimesNotEqualTo(Integer value) {
            addCriterion("bannedTimes <>", value, "bannedtimes");
            return (Criteria) this;
        }

        public Criteria andBannedtimesGreaterThan(Integer value) {
            addCriterion("bannedTimes >", value, "bannedtimes");
            return (Criteria) this;
        }

        public Criteria andBannedtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("bannedTimes >=", value, "bannedtimes");
            return (Criteria) this;
        }

        public Criteria andBannedtimesLessThan(Integer value) {
            addCriterion("bannedTimes <", value, "bannedtimes");
            return (Criteria) this;
        }

        public Criteria andBannedtimesLessThanOrEqualTo(Integer value) {
            addCriterion("bannedTimes <=", value, "bannedtimes");
            return (Criteria) this;
        }

        public Criteria andBannedtimesIn(List<Integer> values) {
            addCriterion("bannedTimes in", values, "bannedtimes");
            return (Criteria) this;
        }

        public Criteria andBannedtimesNotIn(List<Integer> values) {
            addCriterion("bannedTimes not in", values, "bannedtimes");
            return (Criteria) this;
        }

        public Criteria andBannedtimesBetween(Integer value1, Integer value2) {
            addCriterion("bannedTimes between", value1, value2, "bannedtimes");
            return (Criteria) this;
        }

        public Criteria andBannedtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("bannedTimes not between", value1, value2, "bannedtimes");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNull() {
            addCriterion("lastLogin is null");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNotNull() {
            addCriterion("lastLogin is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginEqualTo(Integer value) {
            addCriterion("lastLogin =", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotEqualTo(Integer value) {
            addCriterion("lastLogin <>", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThan(Integer value) {
            addCriterion("lastLogin >", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastLogin >=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThan(Integer value) {
            addCriterion("lastLogin <", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThanOrEqualTo(Integer value) {
            addCriterion("lastLogin <=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginIn(List<Integer> values) {
            addCriterion("lastLogin in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotIn(List<Integer> values) {
            addCriterion("lastLogin not in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginBetween(Integer value1, Integer value2) {
            addCriterion("lastLogin between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotBetween(Integer value1, Integer value2) {
            addCriterion("lastLogin not between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastlogoutIsNull() {
            addCriterion("lastLogout is null");
            return (Criteria) this;
        }

        public Criteria andLastlogoutIsNotNull() {
            addCriterion("lastLogout is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogoutEqualTo(Integer value) {
            addCriterion("lastLogout =", value, "lastlogout");
            return (Criteria) this;
        }

        public Criteria andLastlogoutNotEqualTo(Integer value) {
            addCriterion("lastLogout <>", value, "lastlogout");
            return (Criteria) this;
        }

        public Criteria andLastlogoutGreaterThan(Integer value) {
            addCriterion("lastLogout >", value, "lastlogout");
            return (Criteria) this;
        }

        public Criteria andLastlogoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastLogout >=", value, "lastlogout");
            return (Criteria) this;
        }

        public Criteria andLastlogoutLessThan(Integer value) {
            addCriterion("lastLogout <", value, "lastlogout");
            return (Criteria) this;
        }

        public Criteria andLastlogoutLessThanOrEqualTo(Integer value) {
            addCriterion("lastLogout <=", value, "lastlogout");
            return (Criteria) this;
        }

        public Criteria andLastlogoutIn(List<Integer> values) {
            addCriterion("lastLogout in", values, "lastlogout");
            return (Criteria) this;
        }

        public Criteria andLastlogoutNotIn(List<Integer> values) {
            addCriterion("lastLogout not in", values, "lastlogout");
            return (Criteria) this;
        }

        public Criteria andLastlogoutBetween(Integer value1, Integer value2) {
            addCriterion("lastLogout between", value1, value2, "lastlogout");
            return (Criteria) this;
        }

        public Criteria andLastlogoutNotBetween(Integer value1, Integer value2) {
            addCriterion("lastLogout not between", value1, value2, "lastlogout");
            return (Criteria) this;
        }

        public Criteria andOnlineUpdateIsNull() {
            addCriterion("online_update is null");
            return (Criteria) this;
        }

        public Criteria andOnlineUpdateIsNotNull() {
            addCriterion("online_update is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineUpdateEqualTo(Integer value) {
            addCriterion("online_update =", value, "onlineUpdate");
            return (Criteria) this;
        }

        public Criteria andOnlineUpdateNotEqualTo(Integer value) {
            addCriterion("online_update <>", value, "onlineUpdate");
            return (Criteria) this;
        }

        public Criteria andOnlineUpdateGreaterThan(Integer value) {
            addCriterion("online_update >", value, "onlineUpdate");
            return (Criteria) this;
        }

        public Criteria andOnlineUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_update >=", value, "onlineUpdate");
            return (Criteria) this;
        }

        public Criteria andOnlineUpdateLessThan(Integer value) {
            addCriterion("online_update <", value, "onlineUpdate");
            return (Criteria) this;
        }

        public Criteria andOnlineUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("online_update <=", value, "onlineUpdate");
            return (Criteria) this;
        }

        public Criteria andOnlineUpdateIn(List<Integer> values) {
            addCriterion("online_update in", values, "onlineUpdate");
            return (Criteria) this;
        }

        public Criteria andOnlineUpdateNotIn(List<Integer> values) {
            addCriterion("online_update not in", values, "onlineUpdate");
            return (Criteria) this;
        }

        public Criteria andOnlineUpdateBetween(Integer value1, Integer value2) {
            addCriterion("online_update between", value1, value2, "onlineUpdate");
            return (Criteria) this;
        }

        public Criteria andOnlineUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("online_update not between", value1, value2, "onlineUpdate");
            return (Criteria) this;
        }

        public Criteria andTotalrechargeIsNull() {
            addCriterion("totalRecharge is null");
            return (Criteria) this;
        }

        public Criteria andTotalrechargeIsNotNull() {
            addCriterion("totalRecharge is not null");
            return (Criteria) this;
        }

        public Criteria andTotalrechargeEqualTo(Integer value) {
            addCriterion("totalRecharge =", value, "totalrecharge");
            return (Criteria) this;
        }

        public Criteria andTotalrechargeNotEqualTo(Integer value) {
            addCriterion("totalRecharge <>", value, "totalrecharge");
            return (Criteria) this;
        }

        public Criteria andTotalrechargeGreaterThan(Integer value) {
            addCriterion("totalRecharge >", value, "totalrecharge");
            return (Criteria) this;
        }

        public Criteria andTotalrechargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalRecharge >=", value, "totalrecharge");
            return (Criteria) this;
        }

        public Criteria andTotalrechargeLessThan(Integer value) {
            addCriterion("totalRecharge <", value, "totalrecharge");
            return (Criteria) this;
        }

        public Criteria andTotalrechargeLessThanOrEqualTo(Integer value) {
            addCriterion("totalRecharge <=", value, "totalrecharge");
            return (Criteria) this;
        }

        public Criteria andTotalrechargeIn(List<Integer> values) {
            addCriterion("totalRecharge in", values, "totalrecharge");
            return (Criteria) this;
        }

        public Criteria andTotalrechargeNotIn(List<Integer> values) {
            addCriterion("totalRecharge not in", values, "totalrecharge");
            return (Criteria) this;
        }

        public Criteria andTotalrechargeBetween(Integer value1, Integer value2) {
            addCriterion("totalRecharge between", value1, value2, "totalrecharge");
            return (Criteria) this;
        }

        public Criteria andTotalrechargeNotBetween(Integer value1, Integer value2) {
            addCriterion("totalRecharge not between", value1, value2, "totalrecharge");
            return (Criteria) this;
        }

        public Criteria andVipexpIsNull() {
            addCriterion("vipExp is null");
            return (Criteria) this;
        }

        public Criteria andVipexpIsNotNull() {
            addCriterion("vipExp is not null");
            return (Criteria) this;
        }

        public Criteria andVipexpEqualTo(Integer value) {
            addCriterion("vipExp =", value, "vipexp");
            return (Criteria) this;
        }

        public Criteria andVipexpNotEqualTo(Integer value) {
            addCriterion("vipExp <>", value, "vipexp");
            return (Criteria) this;
        }

        public Criteria andVipexpGreaterThan(Integer value) {
            addCriterion("vipExp >", value, "vipexp");
            return (Criteria) this;
        }

        public Criteria andVipexpGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipExp >=", value, "vipexp");
            return (Criteria) this;
        }

        public Criteria andVipexpLessThan(Integer value) {
            addCriterion("vipExp <", value, "vipexp");
            return (Criteria) this;
        }

        public Criteria andVipexpLessThanOrEqualTo(Integer value) {
            addCriterion("vipExp <=", value, "vipexp");
            return (Criteria) this;
        }

        public Criteria andVipexpIn(List<Integer> values) {
            addCriterion("vipExp in", values, "vipexp");
            return (Criteria) this;
        }

        public Criteria andVipexpNotIn(List<Integer> values) {
            addCriterion("vipExp not in", values, "vipexp");
            return (Criteria) this;
        }

        public Criteria andVipexpBetween(Integer value1, Integer value2) {
            addCriterion("vipExp between", value1, value2, "vipexp");
            return (Criteria) this;
        }

        public Criteria andVipexpNotBetween(Integer value1, Integer value2) {
            addCriterion("vipExp not between", value1, value2, "vipexp");
            return (Criteria) this;
        }

        public Criteria andViplevelIsNull() {
            addCriterion("vipLevel is null");
            return (Criteria) this;
        }

        public Criteria andViplevelIsNotNull() {
            addCriterion("vipLevel is not null");
            return (Criteria) this;
        }

        public Criteria andViplevelEqualTo(Integer value) {
            addCriterion("vipLevel =", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotEqualTo(Integer value) {
            addCriterion("vipLevel <>", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelGreaterThan(Integer value) {
            addCriterion("vipLevel >", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipLevel >=", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelLessThan(Integer value) {
            addCriterion("vipLevel <", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelLessThanOrEqualTo(Integer value) {
            addCriterion("vipLevel <=", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelIn(List<Integer> values) {
            addCriterion("vipLevel in", values, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotIn(List<Integer> values) {
            addCriterion("vipLevel not in", values, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelBetween(Integer value1, Integer value2) {
            addCriterion("vipLevel between", value1, value2, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotBetween(Integer value1, Integer value2) {
            addCriterion("vipLevel not between", value1, value2, "viplevel");
            return (Criteria) this;
        }

        public Criteria andLvIsNull() {
            addCriterion("lv is null");
            return (Criteria) this;
        }

        public Criteria andLvIsNotNull() {
            addCriterion("lv is not null");
            return (Criteria) this;
        }

        public Criteria andLvEqualTo(Integer value) {
            addCriterion("lv =", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotEqualTo(Integer value) {
            addCriterion("lv <>", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThan(Integer value) {
            addCriterion("lv >", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("lv >=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThan(Integer value) {
            addCriterion("lv <", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThanOrEqualTo(Integer value) {
            addCriterion("lv <=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvIn(List<Integer> values) {
            addCriterion("lv in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotIn(List<Integer> values) {
            addCriterion("lv not in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvBetween(Integer value1, Integer value2) {
            addCriterion("lv between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotBetween(Integer value1, Integer value2) {
            addCriterion("lv not between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andExpIsNull() {
            addCriterion("exp is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion("exp is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(Integer value) {
            addCriterion("exp =", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(Integer value) {
            addCriterion("exp <>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(Integer value) {
            addCriterion("exp >", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("exp >=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(Integer value) {
            addCriterion("exp <", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(Integer value) {
            addCriterion("exp <=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<Integer> values) {
            addCriterion("exp in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<Integer> values) {
            addCriterion("exp not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(Integer value1, Integer value2) {
            addCriterion("exp between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(Integer value1, Integer value2) {
            addCriterion("exp not between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andCrystalIsNull() {
            addCriterion("crystal is null");
            return (Criteria) this;
        }

        public Criteria andCrystalIsNotNull() {
            addCriterion("crystal is not null");
            return (Criteria) this;
        }

        public Criteria andCrystalEqualTo(Integer value) {
            addCriterion("crystal =", value, "crystal");
            return (Criteria) this;
        }

        public Criteria andCrystalNotEqualTo(Integer value) {
            addCriterion("crystal <>", value, "crystal");
            return (Criteria) this;
        }

        public Criteria andCrystalGreaterThan(Integer value) {
            addCriterion("crystal >", value, "crystal");
            return (Criteria) this;
        }

        public Criteria andCrystalGreaterThanOrEqualTo(Integer value) {
            addCriterion("crystal >=", value, "crystal");
            return (Criteria) this;
        }

        public Criteria andCrystalLessThan(Integer value) {
            addCriterion("crystal <", value, "crystal");
            return (Criteria) this;
        }

        public Criteria andCrystalLessThanOrEqualTo(Integer value) {
            addCriterion("crystal <=", value, "crystal");
            return (Criteria) this;
        }

        public Criteria andCrystalIn(List<Integer> values) {
            addCriterion("crystal in", values, "crystal");
            return (Criteria) this;
        }

        public Criteria andCrystalNotIn(List<Integer> values) {
            addCriterion("crystal not in", values, "crystal");
            return (Criteria) this;
        }

        public Criteria andCrystalBetween(Integer value1, Integer value2) {
            addCriterion("crystal between", value1, value2, "crystal");
            return (Criteria) this;
        }

        public Criteria andCrystalNotBetween(Integer value1, Integer value2) {
            addCriterion("crystal not between", value1, value2, "crystal");
            return (Criteria) this;
        }

        public Criteria andGoldIsNull() {
            addCriterion("gold is null");
            return (Criteria) this;
        }

        public Criteria andGoldIsNotNull() {
            addCriterion("gold is not null");
            return (Criteria) this;
        }

        public Criteria andGoldEqualTo(Integer value) {
            addCriterion("gold =", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotEqualTo(Integer value) {
            addCriterion("gold <>", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThan(Integer value) {
            addCriterion("gold >", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("gold >=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThan(Integer value) {
            addCriterion("gold <", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThanOrEqualTo(Integer value) {
            addCriterion("gold <=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldIn(List<Integer> values) {
            addCriterion("gold in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotIn(List<Integer> values) {
            addCriterion("gold not in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldBetween(Integer value1, Integer value2) {
            addCriterion("gold between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("gold not between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andDungeonLvIsNull() {
            addCriterion("dungeon_lv is null");
            return (Criteria) this;
        }

        public Criteria andDungeonLvIsNotNull() {
            addCriterion("dungeon_lv is not null");
            return (Criteria) this;
        }

        public Criteria andDungeonLvEqualTo(Integer value) {
            addCriterion("dungeon_lv =", value, "dungeonLv");
            return (Criteria) this;
        }

        public Criteria andDungeonLvNotEqualTo(Integer value) {
            addCriterion("dungeon_lv <>", value, "dungeonLv");
            return (Criteria) this;
        }

        public Criteria andDungeonLvGreaterThan(Integer value) {
            addCriterion("dungeon_lv >", value, "dungeonLv");
            return (Criteria) this;
        }

        public Criteria andDungeonLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("dungeon_lv >=", value, "dungeonLv");
            return (Criteria) this;
        }

        public Criteria andDungeonLvLessThan(Integer value) {
            addCriterion("dungeon_lv <", value, "dungeonLv");
            return (Criteria) this;
        }

        public Criteria andDungeonLvLessThanOrEqualTo(Integer value) {
            addCriterion("dungeon_lv <=", value, "dungeonLv");
            return (Criteria) this;
        }

        public Criteria andDungeonLvIn(List<Integer> values) {
            addCriterion("dungeon_lv in", values, "dungeonLv");
            return (Criteria) this;
        }

        public Criteria andDungeonLvNotIn(List<Integer> values) {
            addCriterion("dungeon_lv not in", values, "dungeonLv");
            return (Criteria) this;
        }

        public Criteria andDungeonLvBetween(Integer value1, Integer value2) {
            addCriterion("dungeon_lv between", value1, value2, "dungeonLv");
            return (Criteria) this;
        }

        public Criteria andDungeonLvNotBetween(Integer value1, Integer value2) {
            addCriterion("dungeon_lv not between", value1, value2, "dungeonLv");
            return (Criteria) this;
        }

        public Criteria andDungeonTimeIsNull() {
            addCriterion("dungeon_time is null");
            return (Criteria) this;
        }

        public Criteria andDungeonTimeIsNotNull() {
            addCriterion("dungeon_time is not null");
            return (Criteria) this;
        }

        public Criteria andDungeonTimeEqualTo(Integer value) {
            addCriterion("dungeon_time =", value, "dungeonTime");
            return (Criteria) this;
        }

        public Criteria andDungeonTimeNotEqualTo(Integer value) {
            addCriterion("dungeon_time <>", value, "dungeonTime");
            return (Criteria) this;
        }

        public Criteria andDungeonTimeGreaterThan(Integer value) {
            addCriterion("dungeon_time >", value, "dungeonTime");
            return (Criteria) this;
        }

        public Criteria andDungeonTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dungeon_time >=", value, "dungeonTime");
            return (Criteria) this;
        }

        public Criteria andDungeonTimeLessThan(Integer value) {
            addCriterion("dungeon_time <", value, "dungeonTime");
            return (Criteria) this;
        }

        public Criteria andDungeonTimeLessThanOrEqualTo(Integer value) {
            addCriterion("dungeon_time <=", value, "dungeonTime");
            return (Criteria) this;
        }

        public Criteria andDungeonTimeIn(List<Integer> values) {
            addCriterion("dungeon_time in", values, "dungeonTime");
            return (Criteria) this;
        }

        public Criteria andDungeonTimeNotIn(List<Integer> values) {
            addCriterion("dungeon_time not in", values, "dungeonTime");
            return (Criteria) this;
        }

        public Criteria andDungeonTimeBetween(Integer value1, Integer value2) {
            addCriterion("dungeon_time between", value1, value2, "dungeonTime");
            return (Criteria) this;
        }

        public Criteria andDungeonTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("dungeon_time not between", value1, value2, "dungeonTime");
            return (Criteria) this;
        }

        public Criteria andExtPackageIsNull() {
            addCriterion("ext_package is null");
            return (Criteria) this;
        }

        public Criteria andExtPackageIsNotNull() {
            addCriterion("ext_package is not null");
            return (Criteria) this;
        }

        public Criteria andExtPackageEqualTo(Integer value) {
            addCriterion("ext_package =", value, "extPackage");
            return (Criteria) this;
        }

        public Criteria andExtPackageNotEqualTo(Integer value) {
            addCriterion("ext_package <>", value, "extPackage");
            return (Criteria) this;
        }

        public Criteria andExtPackageGreaterThan(Integer value) {
            addCriterion("ext_package >", value, "extPackage");
            return (Criteria) this;
        }

        public Criteria andExtPackageGreaterThanOrEqualTo(Integer value) {
            addCriterion("ext_package >=", value, "extPackage");
            return (Criteria) this;
        }

        public Criteria andExtPackageLessThan(Integer value) {
            addCriterion("ext_package <", value, "extPackage");
            return (Criteria) this;
        }

        public Criteria andExtPackageLessThanOrEqualTo(Integer value) {
            addCriterion("ext_package <=", value, "extPackage");
            return (Criteria) this;
        }

        public Criteria andExtPackageIn(List<Integer> values) {
            addCriterion("ext_package in", values, "extPackage");
            return (Criteria) this;
        }

        public Criteria andExtPackageNotIn(List<Integer> values) {
            addCriterion("ext_package not in", values, "extPackage");
            return (Criteria) this;
        }

        public Criteria andExtPackageBetween(Integer value1, Integer value2) {
            addCriterion("ext_package between", value1, value2, "extPackage");
            return (Criteria) this;
        }

        public Criteria andExtPackageNotBetween(Integer value1, Integer value2) {
            addCriterion("ext_package not between", value1, value2, "extPackage");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Integer value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Integer value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Integer value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Integer value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Integer> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Integer> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Integer value1, Integer value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andGmmailcheckidIsNull() {
            addCriterion("GmMailCheckId is null");
            return (Criteria) this;
        }

        public Criteria andGmmailcheckidIsNotNull() {
            addCriterion("GmMailCheckId is not null");
            return (Criteria) this;
        }

        public Criteria andGmmailcheckidEqualTo(Long value) {
            addCriterion("GmMailCheckId =", value, "gmmailcheckid");
            return (Criteria) this;
        }

        public Criteria andGmmailcheckidNotEqualTo(Long value) {
            addCriterion("GmMailCheckId <>", value, "gmmailcheckid");
            return (Criteria) this;
        }

        public Criteria andGmmailcheckidGreaterThan(Long value) {
            addCriterion("GmMailCheckId >", value, "gmmailcheckid");
            return (Criteria) this;
        }

        public Criteria andGmmailcheckidGreaterThanOrEqualTo(Long value) {
            addCriterion("GmMailCheckId >=", value, "gmmailcheckid");
            return (Criteria) this;
        }

        public Criteria andGmmailcheckidLessThan(Long value) {
            addCriterion("GmMailCheckId <", value, "gmmailcheckid");
            return (Criteria) this;
        }

        public Criteria andGmmailcheckidLessThanOrEqualTo(Long value) {
            addCriterion("GmMailCheckId <=", value, "gmmailcheckid");
            return (Criteria) this;
        }

        public Criteria andGmmailcheckidIn(List<Long> values) {
            addCriterion("GmMailCheckId in", values, "gmmailcheckid");
            return (Criteria) this;
        }

        public Criteria andGmmailcheckidNotIn(List<Long> values) {
            addCriterion("GmMailCheckId not in", values, "gmmailcheckid");
            return (Criteria) this;
        }

        public Criteria andGmmailcheckidBetween(Long value1, Long value2) {
            addCriterion("GmMailCheckId between", value1, value2, "gmmailcheckid");
            return (Criteria) this;
        }

        public Criteria andGmmailcheckidNotBetween(Long value1, Long value2) {
            addCriterion("GmMailCheckId not between", value1, value2, "gmmailcheckid");
            return (Criteria) this;
        }

        public Criteria andStrengthenMaterialIsNull() {
            addCriterion("strengthen_material is null");
            return (Criteria) this;
        }

        public Criteria andStrengthenMaterialIsNotNull() {
            addCriterion("strengthen_material is not null");
            return (Criteria) this;
        }

        public Criteria andStrengthenMaterialEqualTo(Integer value) {
            addCriterion("strengthen_material =", value, "strengthenMaterial");
            return (Criteria) this;
        }

        public Criteria andStrengthenMaterialNotEqualTo(Integer value) {
            addCriterion("strengthen_material <>", value, "strengthenMaterial");
            return (Criteria) this;
        }

        public Criteria andStrengthenMaterialGreaterThan(Integer value) {
            addCriterion("strengthen_material >", value, "strengthenMaterial");
            return (Criteria) this;
        }

        public Criteria andStrengthenMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("strengthen_material >=", value, "strengthenMaterial");
            return (Criteria) this;
        }

        public Criteria andStrengthenMaterialLessThan(Integer value) {
            addCriterion("strengthen_material <", value, "strengthenMaterial");
            return (Criteria) this;
        }

        public Criteria andStrengthenMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("strengthen_material <=", value, "strengthenMaterial");
            return (Criteria) this;
        }

        public Criteria andStrengthenMaterialIn(List<Integer> values) {
            addCriterion("strengthen_material in", values, "strengthenMaterial");
            return (Criteria) this;
        }

        public Criteria andStrengthenMaterialNotIn(List<Integer> values) {
            addCriterion("strengthen_material not in", values, "strengthenMaterial");
            return (Criteria) this;
        }

        public Criteria andStrengthenMaterialBetween(Integer value1, Integer value2) {
            addCriterion("strengthen_material between", value1, value2, "strengthenMaterial");
            return (Criteria) this;
        }

        public Criteria andStrengthenMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("strengthen_material not between", value1, value2, "strengthenMaterial");
            return (Criteria) this;
        }

        public Criteria andGemMaterialIsNull() {
            addCriterion("gem_material is null");
            return (Criteria) this;
        }

        public Criteria andGemMaterialIsNotNull() {
            addCriterion("gem_material is not null");
            return (Criteria) this;
        }

        public Criteria andGemMaterialEqualTo(Integer value) {
            addCriterion("gem_material =", value, "gemMaterial");
            return (Criteria) this;
        }

        public Criteria andGemMaterialNotEqualTo(Integer value) {
            addCriterion("gem_material <>", value, "gemMaterial");
            return (Criteria) this;
        }

        public Criteria andGemMaterialGreaterThan(Integer value) {
            addCriterion("gem_material >", value, "gemMaterial");
            return (Criteria) this;
        }

        public Criteria andGemMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("gem_material >=", value, "gemMaterial");
            return (Criteria) this;
        }

        public Criteria andGemMaterialLessThan(Integer value) {
            addCriterion("gem_material <", value, "gemMaterial");
            return (Criteria) this;
        }

        public Criteria andGemMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("gem_material <=", value, "gemMaterial");
            return (Criteria) this;
        }

        public Criteria andGemMaterialIn(List<Integer> values) {
            addCriterion("gem_material in", values, "gemMaterial");
            return (Criteria) this;
        }

        public Criteria andGemMaterialNotIn(List<Integer> values) {
            addCriterion("gem_material not in", values, "gemMaterial");
            return (Criteria) this;
        }

        public Criteria andGemMaterialBetween(Integer value1, Integer value2) {
            addCriterion("gem_material between", value1, value2, "gemMaterial");
            return (Criteria) this;
        }

        public Criteria andGemMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("gem_material not between", value1, value2, "gemMaterial");
            return (Criteria) this;
        }

        public Criteria andStarMaterialIsNull() {
            addCriterion("star_material is null");
            return (Criteria) this;
        }

        public Criteria andStarMaterialIsNotNull() {
            addCriterion("star_material is not null");
            return (Criteria) this;
        }

        public Criteria andStarMaterialEqualTo(Integer value) {
            addCriterion("star_material =", value, "starMaterial");
            return (Criteria) this;
        }

        public Criteria andStarMaterialNotEqualTo(Integer value) {
            addCriterion("star_material <>", value, "starMaterial");
            return (Criteria) this;
        }

        public Criteria andStarMaterialGreaterThan(Integer value) {
            addCriterion("star_material >", value, "starMaterial");
            return (Criteria) this;
        }

        public Criteria andStarMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("star_material >=", value, "starMaterial");
            return (Criteria) this;
        }

        public Criteria andStarMaterialLessThan(Integer value) {
            addCriterion("star_material <", value, "starMaterial");
            return (Criteria) this;
        }

        public Criteria andStarMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("star_material <=", value, "starMaterial");
            return (Criteria) this;
        }

        public Criteria andStarMaterialIn(List<Integer> values) {
            addCriterion("star_material in", values, "starMaterial");
            return (Criteria) this;
        }

        public Criteria andStarMaterialNotIn(List<Integer> values) {
            addCriterion("star_material not in", values, "starMaterial");
            return (Criteria) this;
        }

        public Criteria andStarMaterialBetween(Integer value1, Integer value2) {
            addCriterion("star_material between", value1, value2, "starMaterial");
            return (Criteria) this;
        }

        public Criteria andStarMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("star_material not between", value1, value2, "starMaterial");
            return (Criteria) this;
        }

        public Criteria andMerMaterialIsNull() {
            addCriterion("mer_material is null");
            return (Criteria) this;
        }

        public Criteria andMerMaterialIsNotNull() {
            addCriterion("mer_material is not null");
            return (Criteria) this;
        }

        public Criteria andMerMaterialEqualTo(Integer value) {
            addCriterion("mer_material =", value, "merMaterial");
            return (Criteria) this;
        }

        public Criteria andMerMaterialNotEqualTo(Integer value) {
            addCriterion("mer_material <>", value, "merMaterial");
            return (Criteria) this;
        }

        public Criteria andMerMaterialGreaterThan(Integer value) {
            addCriterion("mer_material >", value, "merMaterial");
            return (Criteria) this;
        }

        public Criteria andMerMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("mer_material >=", value, "merMaterial");
            return (Criteria) this;
        }

        public Criteria andMerMaterialLessThan(Integer value) {
            addCriterion("mer_material <", value, "merMaterial");
            return (Criteria) this;
        }

        public Criteria andMerMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("mer_material <=", value, "merMaterial");
            return (Criteria) this;
        }

        public Criteria andMerMaterialIn(List<Integer> values) {
            addCriterion("mer_material in", values, "merMaterial");
            return (Criteria) this;
        }

        public Criteria andMerMaterialNotIn(List<Integer> values) {
            addCriterion("mer_material not in", values, "merMaterial");
            return (Criteria) this;
        }

        public Criteria andMerMaterialBetween(Integer value1, Integer value2) {
            addCriterion("mer_material between", value1, value2, "merMaterial");
            return (Criteria) this;
        }

        public Criteria andMerMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("mer_material not between", value1, value2, "merMaterial");
            return (Criteria) this;
        }

        public Criteria andWingMaterialIsNull() {
            addCriterion("wing_material is null");
            return (Criteria) this;
        }

        public Criteria andWingMaterialIsNotNull() {
            addCriterion("wing_material is not null");
            return (Criteria) this;
        }

        public Criteria andWingMaterialEqualTo(Integer value) {
            addCriterion("wing_material =", value, "wingMaterial");
            return (Criteria) this;
        }

        public Criteria andWingMaterialNotEqualTo(Integer value) {
            addCriterion("wing_material <>", value, "wingMaterial");
            return (Criteria) this;
        }

        public Criteria andWingMaterialGreaterThan(Integer value) {
            addCriterion("wing_material >", value, "wingMaterial");
            return (Criteria) this;
        }

        public Criteria andWingMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("wing_material >=", value, "wingMaterial");
            return (Criteria) this;
        }

        public Criteria andWingMaterialLessThan(Integer value) {
            addCriterion("wing_material <", value, "wingMaterial");
            return (Criteria) this;
        }

        public Criteria andWingMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("wing_material <=", value, "wingMaterial");
            return (Criteria) this;
        }

        public Criteria andWingMaterialIn(List<Integer> values) {
            addCriterion("wing_material in", values, "wingMaterial");
            return (Criteria) this;
        }

        public Criteria andWingMaterialNotIn(List<Integer> values) {
            addCriterion("wing_material not in", values, "wingMaterial");
            return (Criteria) this;
        }

        public Criteria andWingMaterialBetween(Integer value1, Integer value2) {
            addCriterion("wing_material between", value1, value2, "wingMaterial");
            return (Criteria) this;
        }

        public Criteria andWingMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("wing_material not between", value1, value2, "wingMaterial");
            return (Criteria) this;
        }

        public Criteria andArenaTokenIsNull() {
            addCriterion("arena_token is null");
            return (Criteria) this;
        }

        public Criteria andArenaTokenIsNotNull() {
            addCriterion("arena_token is not null");
            return (Criteria) this;
        }

        public Criteria andArenaTokenEqualTo(Integer value) {
            addCriterion("arena_token =", value, "arenaToken");
            return (Criteria) this;
        }

        public Criteria andArenaTokenNotEqualTo(Integer value) {
            addCriterion("arena_token <>", value, "arenaToken");
            return (Criteria) this;
        }

        public Criteria andArenaTokenGreaterThan(Integer value) {
            addCriterion("arena_token >", value, "arenaToken");
            return (Criteria) this;
        }

        public Criteria andArenaTokenGreaterThanOrEqualTo(Integer value) {
            addCriterion("arena_token >=", value, "arenaToken");
            return (Criteria) this;
        }

        public Criteria andArenaTokenLessThan(Integer value) {
            addCriterion("arena_token <", value, "arenaToken");
            return (Criteria) this;
        }

        public Criteria andArenaTokenLessThanOrEqualTo(Integer value) {
            addCriterion("arena_token <=", value, "arenaToken");
            return (Criteria) this;
        }

        public Criteria andArenaTokenIn(List<Integer> values) {
            addCriterion("arena_token in", values, "arenaToken");
            return (Criteria) this;
        }

        public Criteria andArenaTokenNotIn(List<Integer> values) {
            addCriterion("arena_token not in", values, "arenaToken");
            return (Criteria) this;
        }

        public Criteria andArenaTokenBetween(Integer value1, Integer value2) {
            addCriterion("arena_token between", value1, value2, "arenaToken");
            return (Criteria) this;
        }

        public Criteria andArenaTokenNotBetween(Integer value1, Integer value2) {
            addCriterion("arena_token not between", value1, value2, "arenaToken");
            return (Criteria) this;
        }

        public Criteria andEquipInstanceMaterialIsNull() {
            addCriterion("equip_instance_material is null");
            return (Criteria) this;
        }

        public Criteria andEquipInstanceMaterialIsNotNull() {
            addCriterion("equip_instance_material is not null");
            return (Criteria) this;
        }

        public Criteria andEquipInstanceMaterialEqualTo(Integer value) {
            addCriterion("equip_instance_material =", value, "equipInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andEquipInstanceMaterialNotEqualTo(Integer value) {
            addCriterion("equip_instance_material <>", value, "equipInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andEquipInstanceMaterialGreaterThan(Integer value) {
            addCriterion("equip_instance_material >", value, "equipInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andEquipInstanceMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("equip_instance_material >=", value, "equipInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andEquipInstanceMaterialLessThan(Integer value) {
            addCriterion("equip_instance_material <", value, "equipInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andEquipInstanceMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("equip_instance_material <=", value, "equipInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andEquipInstanceMaterialIn(List<Integer> values) {
            addCriterion("equip_instance_material in", values, "equipInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andEquipInstanceMaterialNotIn(List<Integer> values) {
            addCriterion("equip_instance_material not in", values, "equipInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andEquipInstanceMaterialBetween(Integer value1, Integer value2) {
            addCriterion("equip_instance_material between", value1, value2, "equipInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andEquipInstanceMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("equip_instance_material not between", value1, value2, "equipInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andGemInstanceMaterialIsNull() {
            addCriterion("gem_instance_material is null");
            return (Criteria) this;
        }

        public Criteria andGemInstanceMaterialIsNotNull() {
            addCriterion("gem_instance_material is not null");
            return (Criteria) this;
        }

        public Criteria andGemInstanceMaterialEqualTo(Integer value) {
            addCriterion("gem_instance_material =", value, "gemInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andGemInstanceMaterialNotEqualTo(Integer value) {
            addCriterion("gem_instance_material <>", value, "gemInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andGemInstanceMaterialGreaterThan(Integer value) {
            addCriterion("gem_instance_material >", value, "gemInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andGemInstanceMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("gem_instance_material >=", value, "gemInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andGemInstanceMaterialLessThan(Integer value) {
            addCriterion("gem_instance_material <", value, "gemInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andGemInstanceMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("gem_instance_material <=", value, "gemInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andGemInstanceMaterialIn(List<Integer> values) {
            addCriterion("gem_instance_material in", values, "gemInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andGemInstanceMaterialNotIn(List<Integer> values) {
            addCriterion("gem_instance_material not in", values, "gemInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andGemInstanceMaterialBetween(Integer value1, Integer value2) {
            addCriterion("gem_instance_material between", value1, value2, "gemInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andGemInstanceMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("gem_instance_material not between", value1, value2, "gemInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andMeridianInstanceMaterialIsNull() {
            addCriterion("meridian_instance_material is null");
            return (Criteria) this;
        }

        public Criteria andMeridianInstanceMaterialIsNotNull() {
            addCriterion("meridian_instance_material is not null");
            return (Criteria) this;
        }

        public Criteria andMeridianInstanceMaterialEqualTo(Integer value) {
            addCriterion("meridian_instance_material =", value, "meridianInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andMeridianInstanceMaterialNotEqualTo(Integer value) {
            addCriterion("meridian_instance_material <>", value, "meridianInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andMeridianInstanceMaterialGreaterThan(Integer value) {
            addCriterion("meridian_instance_material >", value, "meridianInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andMeridianInstanceMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("meridian_instance_material >=", value, "meridianInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andMeridianInstanceMaterialLessThan(Integer value) {
            addCriterion("meridian_instance_material <", value, "meridianInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andMeridianInstanceMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("meridian_instance_material <=", value, "meridianInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andMeridianInstanceMaterialIn(List<Integer> values) {
            addCriterion("meridian_instance_material in", values, "meridianInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andMeridianInstanceMaterialNotIn(List<Integer> values) {
            addCriterion("meridian_instance_material not in", values, "meridianInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andMeridianInstanceMaterialBetween(Integer value1, Integer value2) {
            addCriterion("meridian_instance_material between", value1, value2, "meridianInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andMeridianInstanceMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("meridian_instance_material not between", value1, value2, "meridianInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andLingbaoInstanceMaterialIsNull() {
            addCriterion("lingbao_instance_material is null");
            return (Criteria) this;
        }

        public Criteria andLingbaoInstanceMaterialIsNotNull() {
            addCriterion("lingbao_instance_material is not null");
            return (Criteria) this;
        }

        public Criteria andLingbaoInstanceMaterialEqualTo(Integer value) {
            addCriterion("lingbao_instance_material =", value, "lingbaoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andLingbaoInstanceMaterialNotEqualTo(Integer value) {
            addCriterion("lingbao_instance_material <>", value, "lingbaoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andLingbaoInstanceMaterialGreaterThan(Integer value) {
            addCriterion("lingbao_instance_material >", value, "lingbaoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andLingbaoInstanceMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("lingbao_instance_material >=", value, "lingbaoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andLingbaoInstanceMaterialLessThan(Integer value) {
            addCriterion("lingbao_instance_material <", value, "lingbaoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andLingbaoInstanceMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("lingbao_instance_material <=", value, "lingbaoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andLingbaoInstanceMaterialIn(List<Integer> values) {
            addCriterion("lingbao_instance_material in", values, "lingbaoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andLingbaoInstanceMaterialNotIn(List<Integer> values) {
            addCriterion("lingbao_instance_material not in", values, "lingbaoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andLingbaoInstanceMaterialBetween(Integer value1, Integer value2) {
            addCriterion("lingbao_instance_material between", value1, value2, "lingbaoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andLingbaoInstanceMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("lingbao_instance_material not between", value1, value2, "lingbaoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andWingInstanceMaterialIsNull() {
            addCriterion("wing_instance_material is null");
            return (Criteria) this;
        }

        public Criteria andWingInstanceMaterialIsNotNull() {
            addCriterion("wing_instance_material is not null");
            return (Criteria) this;
        }

        public Criteria andWingInstanceMaterialEqualTo(Integer value) {
            addCriterion("wing_instance_material =", value, "wingInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andWingInstanceMaterialNotEqualTo(Integer value) {
            addCriterion("wing_instance_material <>", value, "wingInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andWingInstanceMaterialGreaterThan(Integer value) {
            addCriterion("wing_instance_material >", value, "wingInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andWingInstanceMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("wing_instance_material >=", value, "wingInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andWingInstanceMaterialLessThan(Integer value) {
            addCriterion("wing_instance_material <", value, "wingInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andWingInstanceMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("wing_instance_material <=", value, "wingInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andWingInstanceMaterialIn(List<Integer> values) {
            addCriterion("wing_instance_material in", values, "wingInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andWingInstanceMaterialNotIn(List<Integer> values) {
            addCriterion("wing_instance_material not in", values, "wingInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andWingInstanceMaterialBetween(Integer value1, Integer value2) {
            addCriterion("wing_instance_material between", value1, value2, "wingInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andWingInstanceMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("wing_instance_material not between", value1, value2, "wingInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andStarinfoInstanceMaterialIsNull() {
            addCriterion("starinfo_instance_material is null");
            return (Criteria) this;
        }

        public Criteria andStarinfoInstanceMaterialIsNotNull() {
            addCriterion("starinfo_instance_material is not null");
            return (Criteria) this;
        }

        public Criteria andStarinfoInstanceMaterialEqualTo(Integer value) {
            addCriterion("starinfo_instance_material =", value, "starinfoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andStarinfoInstanceMaterialNotEqualTo(Integer value) {
            addCriterion("starinfo_instance_material <>", value, "starinfoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andStarinfoInstanceMaterialGreaterThan(Integer value) {
            addCriterion("starinfo_instance_material >", value, "starinfoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andStarinfoInstanceMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("starinfo_instance_material >=", value, "starinfoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andStarinfoInstanceMaterialLessThan(Integer value) {
            addCriterion("starinfo_instance_material <", value, "starinfoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andStarinfoInstanceMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("starinfo_instance_material <=", value, "starinfoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andStarinfoInstanceMaterialIn(List<Integer> values) {
            addCriterion("starinfo_instance_material in", values, "starinfoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andStarinfoInstanceMaterialNotIn(List<Integer> values) {
            addCriterion("starinfo_instance_material not in", values, "starinfoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andStarinfoInstanceMaterialBetween(Integer value1, Integer value2) {
            addCriterion("starinfo_instance_material between", value1, value2, "starinfoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andStarinfoInstanceMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("starinfo_instance_material not between", value1, value2, "starinfoInstanceMaterial");
            return (Criteria) this;
        }

        public Criteria andRedPieceIsNull() {
            addCriterion("red_piece is null");
            return (Criteria) this;
        }

        public Criteria andRedPieceIsNotNull() {
            addCriterion("red_piece is not null");
            return (Criteria) this;
        }

        public Criteria andRedPieceEqualTo(Integer value) {
            addCriterion("red_piece =", value, "redPiece");
            return (Criteria) this;
        }

        public Criteria andRedPieceNotEqualTo(Integer value) {
            addCriterion("red_piece <>", value, "redPiece");
            return (Criteria) this;
        }

        public Criteria andRedPieceGreaterThan(Integer value) {
            addCriterion("red_piece >", value, "redPiece");
            return (Criteria) this;
        }

        public Criteria andRedPieceGreaterThanOrEqualTo(Integer value) {
            addCriterion("red_piece >=", value, "redPiece");
            return (Criteria) this;
        }

        public Criteria andRedPieceLessThan(Integer value) {
            addCriterion("red_piece <", value, "redPiece");
            return (Criteria) this;
        }

        public Criteria andRedPieceLessThanOrEqualTo(Integer value) {
            addCriterion("red_piece <=", value, "redPiece");
            return (Criteria) this;
        }

        public Criteria andRedPieceIn(List<Integer> values) {
            addCriterion("red_piece in", values, "redPiece");
            return (Criteria) this;
        }

        public Criteria andRedPieceNotIn(List<Integer> values) {
            addCriterion("red_piece not in", values, "redPiece");
            return (Criteria) this;
        }

        public Criteria andRedPieceBetween(Integer value1, Integer value2) {
            addCriterion("red_piece between", value1, value2, "redPiece");
            return (Criteria) this;
        }

        public Criteria andRedPieceNotBetween(Integer value1, Integer value2) {
            addCriterion("red_piece not between", value1, value2, "redPiece");
            return (Criteria) this;
        }

        public Criteria andArtificeMaterialIsNull() {
            addCriterion("artifice_material is null");
            return (Criteria) this;
        }

        public Criteria andArtificeMaterialIsNotNull() {
            addCriterion("artifice_material is not null");
            return (Criteria) this;
        }

        public Criteria andArtificeMaterialEqualTo(Integer value) {
            addCriterion("artifice_material =", value, "artificeMaterial");
            return (Criteria) this;
        }

        public Criteria andArtificeMaterialNotEqualTo(Integer value) {
            addCriterion("artifice_material <>", value, "artificeMaterial");
            return (Criteria) this;
        }

        public Criteria andArtificeMaterialGreaterThan(Integer value) {
            addCriterion("artifice_material >", value, "artificeMaterial");
            return (Criteria) this;
        }

        public Criteria andArtificeMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("artifice_material >=", value, "artificeMaterial");
            return (Criteria) this;
        }

        public Criteria andArtificeMaterialLessThan(Integer value) {
            addCriterion("artifice_material <", value, "artificeMaterial");
            return (Criteria) this;
        }

        public Criteria andArtificeMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("artifice_material <=", value, "artificeMaterial");
            return (Criteria) this;
        }

        public Criteria andArtificeMaterialIn(List<Integer> values) {
            addCriterion("artifice_material in", values, "artificeMaterial");
            return (Criteria) this;
        }

        public Criteria andArtificeMaterialNotIn(List<Integer> values) {
            addCriterion("artifice_material not in", values, "artificeMaterial");
            return (Criteria) this;
        }

        public Criteria andArtificeMaterialBetween(Integer value1, Integer value2) {
            addCriterion("artifice_material between", value1, value2, "artificeMaterial");
            return (Criteria) this;
        }

        public Criteria andArtificeMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("artifice_material not between", value1, value2, "artificeMaterial");
            return (Criteria) this;
        }

        public Criteria andLotteryIsNull() {
            addCriterion("lottery is null");
            return (Criteria) this;
        }

        public Criteria andLotteryIsNotNull() {
            addCriterion("lottery is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryEqualTo(Integer value) {
            addCriterion("lottery =", value, "lottery");
            return (Criteria) this;
        }

        public Criteria andLotteryNotEqualTo(Integer value) {
            addCriterion("lottery <>", value, "lottery");
            return (Criteria) this;
        }

        public Criteria andLotteryGreaterThan(Integer value) {
            addCriterion("lottery >", value, "lottery");
            return (Criteria) this;
        }

        public Criteria andLotteryGreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery >=", value, "lottery");
            return (Criteria) this;
        }

        public Criteria andLotteryLessThan(Integer value) {
            addCriterion("lottery <", value, "lottery");
            return (Criteria) this;
        }

        public Criteria andLotteryLessThanOrEqualTo(Integer value) {
            addCriterion("lottery <=", value, "lottery");
            return (Criteria) this;
        }

        public Criteria andLotteryIn(List<Integer> values) {
            addCriterion("lottery in", values, "lottery");
            return (Criteria) this;
        }

        public Criteria andLotteryNotIn(List<Integer> values) {
            addCriterion("lottery not in", values, "lottery");
            return (Criteria) this;
        }

        public Criteria andLotteryBetween(Integer value1, Integer value2) {
            addCriterion("lottery between", value1, value2, "lottery");
            return (Criteria) this;
        }

        public Criteria andLotteryNotBetween(Integer value1, Integer value2) {
            addCriterion("lottery not between", value1, value2, "lottery");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentMaterialIsNull() {
            addCriterion("warspirit_talent_material is null");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentMaterialIsNotNull() {
            addCriterion("warspirit_talent_material is not null");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentMaterialEqualTo(Integer value) {
            addCriterion("warspirit_talent_material =", value, "warspiritTalentMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentMaterialNotEqualTo(Integer value) {
            addCriterion("warspirit_talent_material <>", value, "warspiritTalentMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentMaterialGreaterThan(Integer value) {
            addCriterion("warspirit_talent_material >", value, "warspiritTalentMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("warspirit_talent_material >=", value, "warspiritTalentMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentMaterialLessThan(Integer value) {
            addCriterion("warspirit_talent_material <", value, "warspiritTalentMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("warspirit_talent_material <=", value, "warspiritTalentMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentMaterialIn(List<Integer> values) {
            addCriterion("warspirit_talent_material in", values, "warspiritTalentMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentMaterialNotIn(List<Integer> values) {
            addCriterion("warspirit_talent_material not in", values, "warspiritTalentMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentMaterialBetween(Integer value1, Integer value2) {
            addCriterion("warspirit_talent_material between", value1, value2, "warspiritTalentMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("warspirit_talent_material not between", value1, value2, "warspiritTalentMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvMaterialIsNull() {
            addCriterion("warspirit_lv_material is null");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvMaterialIsNotNull() {
            addCriterion("warspirit_lv_material is not null");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvMaterialEqualTo(Integer value) {
            addCriterion("warspirit_lv_material =", value, "warspiritLvMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvMaterialNotEqualTo(Integer value) {
            addCriterion("warspirit_lv_material <>", value, "warspiritLvMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvMaterialGreaterThan(Integer value) {
            addCriterion("warspirit_lv_material >", value, "warspiritLvMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("warspirit_lv_material >=", value, "warspiritLvMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvMaterialLessThan(Integer value) {
            addCriterion("warspirit_lv_material <", value, "warspiritLvMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("warspirit_lv_material <=", value, "warspiritLvMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvMaterialIn(List<Integer> values) {
            addCriterion("warspirit_lv_material in", values, "warspiritLvMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvMaterialNotIn(List<Integer> values) {
            addCriterion("warspirit_lv_material not in", values, "warspiritLvMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvMaterialBetween(Integer value1, Integer value2) {
            addCriterion("warspirit_lv_material between", value1, value2, "warspiritLvMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("warspirit_lv_material not between", value1, value2, "warspiritLvMaterial");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvIsNull() {
            addCriterion("warspirit_lv is null");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvIsNotNull() {
            addCriterion("warspirit_lv is not null");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvEqualTo(Integer value) {
            addCriterion("warspirit_lv =", value, "warspiritLv");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvNotEqualTo(Integer value) {
            addCriterion("warspirit_lv <>", value, "warspiritLv");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvGreaterThan(Integer value) {
            addCriterion("warspirit_lv >", value, "warspiritLv");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("warspirit_lv >=", value, "warspiritLv");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvLessThan(Integer value) {
            addCriterion("warspirit_lv <", value, "warspiritLv");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvLessThanOrEqualTo(Integer value) {
            addCriterion("warspirit_lv <=", value, "warspiritLv");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvIn(List<Integer> values) {
            addCriterion("warspirit_lv in", values, "warspiritLv");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvNotIn(List<Integer> values) {
            addCriterion("warspirit_lv not in", values, "warspiritLv");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvBetween(Integer value1, Integer value2) {
            addCriterion("warspirit_lv between", value1, value2, "warspiritLv");
            return (Criteria) this;
        }

        public Criteria andWarspiritLvNotBetween(Integer value1, Integer value2) {
            addCriterion("warspirit_lv not between", value1, value2, "warspiritLv");
            return (Criteria) this;
        }

        public Criteria andWarspiritExpIsNull() {
            addCriterion("warspirit_exp is null");
            return (Criteria) this;
        }

        public Criteria andWarspiritExpIsNotNull() {
            addCriterion("warspirit_exp is not null");
            return (Criteria) this;
        }

        public Criteria andWarspiritExpEqualTo(Integer value) {
            addCriterion("warspirit_exp =", value, "warspiritExp");
            return (Criteria) this;
        }

        public Criteria andWarspiritExpNotEqualTo(Integer value) {
            addCriterion("warspirit_exp <>", value, "warspiritExp");
            return (Criteria) this;
        }

        public Criteria andWarspiritExpGreaterThan(Integer value) {
            addCriterion("warspirit_exp >", value, "warspiritExp");
            return (Criteria) this;
        }

        public Criteria andWarspiritExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("warspirit_exp >=", value, "warspiritExp");
            return (Criteria) this;
        }

        public Criteria andWarspiritExpLessThan(Integer value) {
            addCriterion("warspirit_exp <", value, "warspiritExp");
            return (Criteria) this;
        }

        public Criteria andWarspiritExpLessThanOrEqualTo(Integer value) {
            addCriterion("warspirit_exp <=", value, "warspiritExp");
            return (Criteria) this;
        }

        public Criteria andWarspiritExpIn(List<Integer> values) {
            addCriterion("warspirit_exp in", values, "warspiritExp");
            return (Criteria) this;
        }

        public Criteria andWarspiritExpNotIn(List<Integer> values) {
            addCriterion("warspirit_exp not in", values, "warspiritExp");
            return (Criteria) this;
        }

        public Criteria andWarspiritExpBetween(Integer value1, Integer value2) {
            addCriterion("warspirit_exp between", value1, value2, "warspiritExp");
            return (Criteria) this;
        }

        public Criteria andWarspiritExpNotBetween(Integer value1, Integer value2) {
            addCriterion("warspirit_exp not between", value1, value2, "warspiritExp");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentIsNull() {
            addCriterion("warspirit_talent is null");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentIsNotNull() {
            addCriterion("warspirit_talent is not null");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentEqualTo(Integer value) {
            addCriterion("warspirit_talent =", value, "warspiritTalent");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentNotEqualTo(Integer value) {
            addCriterion("warspirit_talent <>", value, "warspiritTalent");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentGreaterThan(Integer value) {
            addCriterion("warspirit_talent >", value, "warspiritTalent");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentGreaterThanOrEqualTo(Integer value) {
            addCriterion("warspirit_talent >=", value, "warspiritTalent");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentLessThan(Integer value) {
            addCriterion("warspirit_talent <", value, "warspiritTalent");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentLessThanOrEqualTo(Integer value) {
            addCriterion("warspirit_talent <=", value, "warspiritTalent");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentIn(List<Integer> values) {
            addCriterion("warspirit_talent in", values, "warspiritTalent");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentNotIn(List<Integer> values) {
            addCriterion("warspirit_talent not in", values, "warspiritTalent");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentBetween(Integer value1, Integer value2) {
            addCriterion("warspirit_talent between", value1, value2, "warspiritTalent");
            return (Criteria) this;
        }

        public Criteria andWarspiritTalentNotBetween(Integer value1, Integer value2) {
            addCriterion("warspirit_talent not between", value1, value2, "warspiritTalent");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDecompositionIsNull() {
            addCriterion("vicegeneral_decomposition is null");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDecompositionIsNotNull() {
            addCriterion("vicegeneral_decomposition is not null");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDecompositionEqualTo(Integer value) {
            addCriterion("vicegeneral_decomposition =", value, "vicegeneralDecomposition");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDecompositionNotEqualTo(Integer value) {
            addCriterion("vicegeneral_decomposition <>", value, "vicegeneralDecomposition");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDecompositionGreaterThan(Integer value) {
            addCriterion("vicegeneral_decomposition >", value, "vicegeneralDecomposition");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDecompositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("vicegeneral_decomposition >=", value, "vicegeneralDecomposition");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDecompositionLessThan(Integer value) {
            addCriterion("vicegeneral_decomposition <", value, "vicegeneralDecomposition");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDecompositionLessThanOrEqualTo(Integer value) {
            addCriterion("vicegeneral_decomposition <=", value, "vicegeneralDecomposition");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDecompositionIn(List<Integer> values) {
            addCriterion("vicegeneral_decomposition in", values, "vicegeneralDecomposition");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDecompositionNotIn(List<Integer> values) {
            addCriterion("vicegeneral_decomposition not in", values, "vicegeneralDecomposition");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDecompositionBetween(Integer value1, Integer value2) {
            addCriterion("vicegeneral_decomposition between", value1, value2, "vicegeneralDecomposition");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDecompositionNotBetween(Integer value1, Integer value2) {
            addCriterion("vicegeneral_decomposition not between", value1, value2, "vicegeneralDecomposition");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDrawcardIsNull() {
            addCriterion("vicegeneral_drawCard is null");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDrawcardIsNotNull() {
            addCriterion("vicegeneral_drawCard is not null");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDrawcardEqualTo(Integer value) {
            addCriterion("vicegeneral_drawCard =", value, "vicegeneralDrawcard");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDrawcardNotEqualTo(Integer value) {
            addCriterion("vicegeneral_drawCard <>", value, "vicegeneralDrawcard");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDrawcardGreaterThan(Integer value) {
            addCriterion("vicegeneral_drawCard >", value, "vicegeneralDrawcard");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDrawcardGreaterThanOrEqualTo(Integer value) {
            addCriterion("vicegeneral_drawCard >=", value, "vicegeneralDrawcard");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDrawcardLessThan(Integer value) {
            addCriterion("vicegeneral_drawCard <", value, "vicegeneralDrawcard");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDrawcardLessThanOrEqualTo(Integer value) {
            addCriterion("vicegeneral_drawCard <=", value, "vicegeneralDrawcard");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDrawcardIn(List<Integer> values) {
            addCriterion("vicegeneral_drawCard in", values, "vicegeneralDrawcard");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDrawcardNotIn(List<Integer> values) {
            addCriterion("vicegeneral_drawCard not in", values, "vicegeneralDrawcard");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDrawcardBetween(Integer value1, Integer value2) {
            addCriterion("vicegeneral_drawCard between", value1, value2, "vicegeneralDrawcard");
            return (Criteria) this;
        }

        public Criteria andVicegeneralDrawcardNotBetween(Integer value1, Integer value2) {
            addCriterion("vicegeneral_drawCard not between", value1, value2, "vicegeneralDrawcard");
            return (Criteria) this;
        }

        public Criteria andCopycentIsNull() {
            addCriterion("copyCent is null");
            return (Criteria) this;
        }

        public Criteria andCopycentIsNotNull() {
            addCriterion("copyCent is not null");
            return (Criteria) this;
        }

        public Criteria andCopycentEqualTo(Integer value) {
            addCriterion("copyCent =", value, "copycent");
            return (Criteria) this;
        }

        public Criteria andCopycentNotEqualTo(Integer value) {
            addCriterion("copyCent <>", value, "copycent");
            return (Criteria) this;
        }

        public Criteria andCopycentGreaterThan(Integer value) {
            addCriterion("copyCent >", value, "copycent");
            return (Criteria) this;
        }

        public Criteria andCopycentGreaterThanOrEqualTo(Integer value) {
            addCriterion("copyCent >=", value, "copycent");
            return (Criteria) this;
        }

        public Criteria andCopycentLessThan(Integer value) {
            addCriterion("copyCent <", value, "copycent");
            return (Criteria) this;
        }

        public Criteria andCopycentLessThanOrEqualTo(Integer value) {
            addCriterion("copyCent <=", value, "copycent");
            return (Criteria) this;
        }

        public Criteria andCopycentIn(List<Integer> values) {
            addCriterion("copyCent in", values, "copycent");
            return (Criteria) this;
        }

        public Criteria andCopycentNotIn(List<Integer> values) {
            addCriterion("copyCent not in", values, "copycent");
            return (Criteria) this;
        }

        public Criteria andCopycentBetween(Integer value1, Integer value2) {
            addCriterion("copyCent between", value1, value2, "copycent");
            return (Criteria) this;
        }

        public Criteria andCopycentNotBetween(Integer value1, Integer value2) {
            addCriterion("copyCent not between", value1, value2, "copycent");
            return (Criteria) this;
        }

        public Criteria andCivilwarcentIsNull() {
            addCriterion("civilWarCent is null");
            return (Criteria) this;
        }

        public Criteria andCivilwarcentIsNotNull() {
            addCriterion("civilWarCent is not null");
            return (Criteria) this;
        }

        public Criteria andCivilwarcentEqualTo(Integer value) {
            addCriterion("civilWarCent =", value, "civilwarcent");
            return (Criteria) this;
        }

        public Criteria andCivilwarcentNotEqualTo(Integer value) {
            addCriterion("civilWarCent <>", value, "civilwarcent");
            return (Criteria) this;
        }

        public Criteria andCivilwarcentGreaterThan(Integer value) {
            addCriterion("civilWarCent >", value, "civilwarcent");
            return (Criteria) this;
        }

        public Criteria andCivilwarcentGreaterThanOrEqualTo(Integer value) {
            addCriterion("civilWarCent >=", value, "civilwarcent");
            return (Criteria) this;
        }

        public Criteria andCivilwarcentLessThan(Integer value) {
            addCriterion("civilWarCent <", value, "civilwarcent");
            return (Criteria) this;
        }

        public Criteria andCivilwarcentLessThanOrEqualTo(Integer value) {
            addCriterion("civilWarCent <=", value, "civilwarcent");
            return (Criteria) this;
        }

        public Criteria andCivilwarcentIn(List<Integer> values) {
            addCriterion("civilWarCent in", values, "civilwarcent");
            return (Criteria) this;
        }

        public Criteria andCivilwarcentNotIn(List<Integer> values) {
            addCriterion("civilWarCent not in", values, "civilwarcent");
            return (Criteria) this;
        }

        public Criteria andCivilwarcentBetween(Integer value1, Integer value2) {
            addCriterion("civilWarCent between", value1, value2, "civilwarcent");
            return (Criteria) this;
        }

        public Criteria andCivilwarcentNotBetween(Integer value1, Integer value2) {
            addCriterion("civilWarCent not between", value1, value2, "civilwarcent");
            return (Criteria) this;
        }

        public Criteria andGuildforageIsNull() {
            addCriterion("GuildForage is null");
            return (Criteria) this;
        }

        public Criteria andGuildforageIsNotNull() {
            addCriterion("GuildForage is not null");
            return (Criteria) this;
        }

        public Criteria andGuildforageEqualTo(Integer value) {
            addCriterion("GuildForage =", value, "guildforage");
            return (Criteria) this;
        }

        public Criteria andGuildforageNotEqualTo(Integer value) {
            addCriterion("GuildForage <>", value, "guildforage");
            return (Criteria) this;
        }

        public Criteria andGuildforageGreaterThan(Integer value) {
            addCriterion("GuildForage >", value, "guildforage");
            return (Criteria) this;
        }

        public Criteria andGuildforageGreaterThanOrEqualTo(Integer value) {
            addCriterion("GuildForage >=", value, "guildforage");
            return (Criteria) this;
        }

        public Criteria andGuildforageLessThan(Integer value) {
            addCriterion("GuildForage <", value, "guildforage");
            return (Criteria) this;
        }

        public Criteria andGuildforageLessThanOrEqualTo(Integer value) {
            addCriterion("GuildForage <=", value, "guildforage");
            return (Criteria) this;
        }

        public Criteria andGuildforageIn(List<Integer> values) {
            addCriterion("GuildForage in", values, "guildforage");
            return (Criteria) this;
        }

        public Criteria andGuildforageNotIn(List<Integer> values) {
            addCriterion("GuildForage not in", values, "guildforage");
            return (Criteria) this;
        }

        public Criteria andGuildforageBetween(Integer value1, Integer value2) {
            addCriterion("GuildForage between", value1, value2, "guildforage");
            return (Criteria) this;
        }

        public Criteria andGuildforageNotBetween(Integer value1, Integer value2) {
            addCriterion("GuildForage not between", value1, value2, "guildforage");
            return (Criteria) this;
        }

        public Criteria andDressMaterialIsNull() {
            addCriterion("dress_material is null");
            return (Criteria) this;
        }

        public Criteria andDressMaterialIsNotNull() {
            addCriterion("dress_material is not null");
            return (Criteria) this;
        }

        public Criteria andDressMaterialEqualTo(Integer value) {
            addCriterion("dress_material =", value, "dressMaterial");
            return (Criteria) this;
        }

        public Criteria andDressMaterialNotEqualTo(Integer value) {
            addCriterion("dress_material <>", value, "dressMaterial");
            return (Criteria) this;
        }

        public Criteria andDressMaterialGreaterThan(Integer value) {
            addCriterion("dress_material >", value, "dressMaterial");
            return (Criteria) this;
        }

        public Criteria andDressMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("dress_material >=", value, "dressMaterial");
            return (Criteria) this;
        }

        public Criteria andDressMaterialLessThan(Integer value) {
            addCriterion("dress_material <", value, "dressMaterial");
            return (Criteria) this;
        }

        public Criteria andDressMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("dress_material <=", value, "dressMaterial");
            return (Criteria) this;
        }

        public Criteria andDressMaterialIn(List<Integer> values) {
            addCriterion("dress_material in", values, "dressMaterial");
            return (Criteria) this;
        }

        public Criteria andDressMaterialNotIn(List<Integer> values) {
            addCriterion("dress_material not in", values, "dressMaterial");
            return (Criteria) this;
        }

        public Criteria andDressMaterialBetween(Integer value1, Integer value2) {
            addCriterion("dress_material between", value1, value2, "dressMaterial");
            return (Criteria) this;
        }

        public Criteria andDressMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("dress_material not between", value1, value2, "dressMaterial");
            return (Criteria) this;
        }

        public Criteria andExpMaterialIsNull() {
            addCriterion("exp_material is null");
            return (Criteria) this;
        }

        public Criteria andExpMaterialIsNotNull() {
            addCriterion("exp_material is not null");
            return (Criteria) this;
        }

        public Criteria andExpMaterialEqualTo(Integer value) {
            addCriterion("exp_material =", value, "expMaterial");
            return (Criteria) this;
        }

        public Criteria andExpMaterialNotEqualTo(Integer value) {
            addCriterion("exp_material <>", value, "expMaterial");
            return (Criteria) this;
        }

        public Criteria andExpMaterialGreaterThan(Integer value) {
            addCriterion("exp_material >", value, "expMaterial");
            return (Criteria) this;
        }

        public Criteria andExpMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("exp_material >=", value, "expMaterial");
            return (Criteria) this;
        }

        public Criteria andExpMaterialLessThan(Integer value) {
            addCriterion("exp_material <", value, "expMaterial");
            return (Criteria) this;
        }

        public Criteria andExpMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("exp_material <=", value, "expMaterial");
            return (Criteria) this;
        }

        public Criteria andExpMaterialIn(List<Integer> values) {
            addCriterion("exp_material in", values, "expMaterial");
            return (Criteria) this;
        }

        public Criteria andExpMaterialNotIn(List<Integer> values) {
            addCriterion("exp_material not in", values, "expMaterial");
            return (Criteria) this;
        }

        public Criteria andExpMaterialBetween(Integer value1, Integer value2) {
            addCriterion("exp_material between", value1, value2, "expMaterial");
            return (Criteria) this;
        }

        public Criteria andExpMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("exp_material not between", value1, value2, "expMaterial");
            return (Criteria) this;
        }

        public Criteria andRebirthIsNull() {
            addCriterion("rebirth is null");
            return (Criteria) this;
        }

        public Criteria andRebirthIsNotNull() {
            addCriterion("rebirth is not null");
            return (Criteria) this;
        }

        public Criteria andRebirthEqualTo(Integer value) {
            addCriterion("rebirth =", value, "rebirth");
            return (Criteria) this;
        }

        public Criteria andRebirthNotEqualTo(Integer value) {
            addCriterion("rebirth <>", value, "rebirth");
            return (Criteria) this;
        }

        public Criteria andRebirthGreaterThan(Integer value) {
            addCriterion("rebirth >", value, "rebirth");
            return (Criteria) this;
        }

        public Criteria andRebirthGreaterThanOrEqualTo(Integer value) {
            addCriterion("rebirth >=", value, "rebirth");
            return (Criteria) this;
        }

        public Criteria andRebirthLessThan(Integer value) {
            addCriterion("rebirth <", value, "rebirth");
            return (Criteria) this;
        }

        public Criteria andRebirthLessThanOrEqualTo(Integer value) {
            addCriterion("rebirth <=", value, "rebirth");
            return (Criteria) this;
        }

        public Criteria andRebirthIn(List<Integer> values) {
            addCriterion("rebirth in", values, "rebirth");
            return (Criteria) this;
        }

        public Criteria andRebirthNotIn(List<Integer> values) {
            addCriterion("rebirth not in", values, "rebirth");
            return (Criteria) this;
        }

        public Criteria andRebirthBetween(Integer value1, Integer value2) {
            addCriterion("rebirth between", value1, value2, "rebirth");
            return (Criteria) this;
        }

        public Criteria andRebirthNotBetween(Integer value1, Integer value2) {
            addCriterion("rebirth not between", value1, value2, "rebirth");
            return (Criteria) this;
        }

        public Criteria andRebirthexpIsNull() {
            addCriterion("rebirthExp is null");
            return (Criteria) this;
        }

        public Criteria andRebirthexpIsNotNull() {
            addCriterion("rebirthExp is not null");
            return (Criteria) this;
        }

        public Criteria andRebirthexpEqualTo(Integer value) {
            addCriterion("rebirthExp =", value, "rebirthexp");
            return (Criteria) this;
        }

        public Criteria andRebirthexpNotEqualTo(Integer value) {
            addCriterion("rebirthExp <>", value, "rebirthexp");
            return (Criteria) this;
        }

        public Criteria andRebirthexpGreaterThan(Integer value) {
            addCriterion("rebirthExp >", value, "rebirthexp");
            return (Criteria) this;
        }

        public Criteria andRebirthexpGreaterThanOrEqualTo(Integer value) {
            addCriterion("rebirthExp >=", value, "rebirthexp");
            return (Criteria) this;
        }

        public Criteria andRebirthexpLessThan(Integer value) {
            addCriterion("rebirthExp <", value, "rebirthexp");
            return (Criteria) this;
        }

        public Criteria andRebirthexpLessThanOrEqualTo(Integer value) {
            addCriterion("rebirthExp <=", value, "rebirthexp");
            return (Criteria) this;
        }

        public Criteria andRebirthexpIn(List<Integer> values) {
            addCriterion("rebirthExp in", values, "rebirthexp");
            return (Criteria) this;
        }

        public Criteria andRebirthexpNotIn(List<Integer> values) {
            addCriterion("rebirthExp not in", values, "rebirthexp");
            return (Criteria) this;
        }

        public Criteria andRebirthexpBetween(Integer value1, Integer value2) {
            addCriterion("rebirthExp between", value1, value2, "rebirthexp");
            return (Criteria) this;
        }

        public Criteria andRebirthexpNotBetween(Integer value1, Integer value2) {
            addCriterion("rebirthExp not between", value1, value2, "rebirthexp");
            return (Criteria) this;
        }

        public Criteria andPremaintaskidIsNull() {
            addCriterion("preMainTaskId is null");
            return (Criteria) this;
        }

        public Criteria andPremaintaskidIsNotNull() {
            addCriterion("preMainTaskId is not null");
            return (Criteria) this;
        }

        public Criteria andPremaintaskidEqualTo(Integer value) {
            addCriterion("preMainTaskId =", value, "premaintaskid");
            return (Criteria) this;
        }

        public Criteria andPremaintaskidNotEqualTo(Integer value) {
            addCriterion("preMainTaskId <>", value, "premaintaskid");
            return (Criteria) this;
        }

        public Criteria andPremaintaskidGreaterThan(Integer value) {
            addCriterion("preMainTaskId >", value, "premaintaskid");
            return (Criteria) this;
        }

        public Criteria andPremaintaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("preMainTaskId >=", value, "premaintaskid");
            return (Criteria) this;
        }

        public Criteria andPremaintaskidLessThan(Integer value) {
            addCriterion("preMainTaskId <", value, "premaintaskid");
            return (Criteria) this;
        }

        public Criteria andPremaintaskidLessThanOrEqualTo(Integer value) {
            addCriterion("preMainTaskId <=", value, "premaintaskid");
            return (Criteria) this;
        }

        public Criteria andPremaintaskidIn(List<Integer> values) {
            addCriterion("preMainTaskId in", values, "premaintaskid");
            return (Criteria) this;
        }

        public Criteria andPremaintaskidNotIn(List<Integer> values) {
            addCriterion("preMainTaskId not in", values, "premaintaskid");
            return (Criteria) this;
        }

        public Criteria andPremaintaskidBetween(Integer value1, Integer value2) {
            addCriterion("preMainTaskId between", value1, value2, "premaintaskid");
            return (Criteria) this;
        }

        public Criteria andPremaintaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("preMainTaskId not between", value1, value2, "premaintaskid");
            return (Criteria) this;
        }

        public Criteria andCurmaintaskcompletecountIsNull() {
            addCriterion("curMainTaskCompleteCount is null");
            return (Criteria) this;
        }

        public Criteria andCurmaintaskcompletecountIsNotNull() {
            addCriterion("curMainTaskCompleteCount is not null");
            return (Criteria) this;
        }

        public Criteria andCurmaintaskcompletecountEqualTo(Integer value) {
            addCriterion("curMainTaskCompleteCount =", value, "curmaintaskcompletecount");
            return (Criteria) this;
        }

        public Criteria andCurmaintaskcompletecountNotEqualTo(Integer value) {
            addCriterion("curMainTaskCompleteCount <>", value, "curmaintaskcompletecount");
            return (Criteria) this;
        }

        public Criteria andCurmaintaskcompletecountGreaterThan(Integer value) {
            addCriterion("curMainTaskCompleteCount >", value, "curmaintaskcompletecount");
            return (Criteria) this;
        }

        public Criteria andCurmaintaskcompletecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("curMainTaskCompleteCount >=", value, "curmaintaskcompletecount");
            return (Criteria) this;
        }

        public Criteria andCurmaintaskcompletecountLessThan(Integer value) {
            addCriterion("curMainTaskCompleteCount <", value, "curmaintaskcompletecount");
            return (Criteria) this;
        }

        public Criteria andCurmaintaskcompletecountLessThanOrEqualTo(Integer value) {
            addCriterion("curMainTaskCompleteCount <=", value, "curmaintaskcompletecount");
            return (Criteria) this;
        }

        public Criteria andCurmaintaskcompletecountIn(List<Integer> values) {
            addCriterion("curMainTaskCompleteCount in", values, "curmaintaskcompletecount");
            return (Criteria) this;
        }

        public Criteria andCurmaintaskcompletecountNotIn(List<Integer> values) {
            addCriterion("curMainTaskCompleteCount not in", values, "curmaintaskcompletecount");
            return (Criteria) this;
        }

        public Criteria andCurmaintaskcompletecountBetween(Integer value1, Integer value2) {
            addCriterion("curMainTaskCompleteCount between", value1, value2, "curmaintaskcompletecount");
            return (Criteria) this;
        }

        public Criteria andCurmaintaskcompletecountNotBetween(Integer value1, Integer value2) {
            addCriterion("curMainTaskCompleteCount not between", value1, value2, "curmaintaskcompletecount");
            return (Criteria) this;
        }

        public Criteria andMicrorewardstateIsNull() {
            addCriterion("microRewardState is null");
            return (Criteria) this;
        }

        public Criteria andMicrorewardstateIsNotNull() {
            addCriterion("microRewardState is not null");
            return (Criteria) this;
        }

        public Criteria andMicrorewardstateEqualTo(Integer value) {
            addCriterion("microRewardState =", value, "microrewardstate");
            return (Criteria) this;
        }

        public Criteria andMicrorewardstateNotEqualTo(Integer value) {
            addCriterion("microRewardState <>", value, "microrewardstate");
            return (Criteria) this;
        }

        public Criteria andMicrorewardstateGreaterThan(Integer value) {
            addCriterion("microRewardState >", value, "microrewardstate");
            return (Criteria) this;
        }

        public Criteria andMicrorewardstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("microRewardState >=", value, "microrewardstate");
            return (Criteria) this;
        }

        public Criteria andMicrorewardstateLessThan(Integer value) {
            addCriterion("microRewardState <", value, "microrewardstate");
            return (Criteria) this;
        }

        public Criteria andMicrorewardstateLessThanOrEqualTo(Integer value) {
            addCriterion("microRewardState <=", value, "microrewardstate");
            return (Criteria) this;
        }

        public Criteria andMicrorewardstateIn(List<Integer> values) {
            addCriterion("microRewardState in", values, "microrewardstate");
            return (Criteria) this;
        }

        public Criteria andMicrorewardstateNotIn(List<Integer> values) {
            addCriterion("microRewardState not in", values, "microrewardstate");
            return (Criteria) this;
        }

        public Criteria andMicrorewardstateBetween(Integer value1, Integer value2) {
            addCriterion("microRewardState between", value1, value2, "microrewardstate");
            return (Criteria) this;
        }

        public Criteria andMicrorewardstateNotBetween(Integer value1, Integer value2) {
            addCriterion("microRewardState not between", value1, value2, "microrewardstate");
            return (Criteria) this;
        }

        public Criteria andVicegeneratancematerialIsNull() {
            addCriterion("viceGeneratanceMaterial is null");
            return (Criteria) this;
        }

        public Criteria andVicegeneratancematerialIsNotNull() {
            addCriterion("viceGeneratanceMaterial is not null");
            return (Criteria) this;
        }

        public Criteria andVicegeneratancematerialEqualTo(Integer value) {
            addCriterion("viceGeneratanceMaterial =", value, "vicegeneratancematerial");
            return (Criteria) this;
        }

        public Criteria andVicegeneratancematerialNotEqualTo(Integer value) {
            addCriterion("viceGeneratanceMaterial <>", value, "vicegeneratancematerial");
            return (Criteria) this;
        }

        public Criteria andVicegeneratancematerialGreaterThan(Integer value) {
            addCriterion("viceGeneratanceMaterial >", value, "vicegeneratancematerial");
            return (Criteria) this;
        }

        public Criteria andVicegeneratancematerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("viceGeneratanceMaterial >=", value, "vicegeneratancematerial");
            return (Criteria) this;
        }

        public Criteria andVicegeneratancematerialLessThan(Integer value) {
            addCriterion("viceGeneratanceMaterial <", value, "vicegeneratancematerial");
            return (Criteria) this;
        }

        public Criteria andVicegeneratancematerialLessThanOrEqualTo(Integer value) {
            addCriterion("viceGeneratanceMaterial <=", value, "vicegeneratancematerial");
            return (Criteria) this;
        }

        public Criteria andVicegeneratancematerialIn(List<Integer> values) {
            addCriterion("viceGeneratanceMaterial in", values, "vicegeneratancematerial");
            return (Criteria) this;
        }

        public Criteria andVicegeneratancematerialNotIn(List<Integer> values) {
            addCriterion("viceGeneratanceMaterial not in", values, "vicegeneratancematerial");
            return (Criteria) this;
        }

        public Criteria andVicegeneratancematerialBetween(Integer value1, Integer value2) {
            addCriterion("viceGeneratanceMaterial between", value1, value2, "vicegeneratancematerial");
            return (Criteria) this;
        }

        public Criteria andVicegeneratancematerialNotBetween(Integer value1, Integer value2) {
            addCriterion("viceGeneratanceMaterial not between", value1, value2, "vicegeneratancematerial");
            return (Criteria) this;
        }

        public Criteria andVicegeneratanceinstancetimeIsNull() {
            addCriterion("viceGeneratanceInstanceTime is null");
            return (Criteria) this;
        }

        public Criteria andVicegeneratanceinstancetimeIsNotNull() {
            addCriterion("viceGeneratanceInstanceTime is not null");
            return (Criteria) this;
        }

        public Criteria andVicegeneratanceinstancetimeEqualTo(Integer value) {
            addCriterion("viceGeneratanceInstanceTime =", value, "vicegeneratanceinstancetime");
            return (Criteria) this;
        }

        public Criteria andVicegeneratanceinstancetimeNotEqualTo(Integer value) {
            addCriterion("viceGeneratanceInstanceTime <>", value, "vicegeneratanceinstancetime");
            return (Criteria) this;
        }

        public Criteria andVicegeneratanceinstancetimeGreaterThan(Integer value) {
            addCriterion("viceGeneratanceInstanceTime >", value, "vicegeneratanceinstancetime");
            return (Criteria) this;
        }

        public Criteria andVicegeneratanceinstancetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("viceGeneratanceInstanceTime >=", value, "vicegeneratanceinstancetime");
            return (Criteria) this;
        }

        public Criteria andVicegeneratanceinstancetimeLessThan(Integer value) {
            addCriterion("viceGeneratanceInstanceTime <", value, "vicegeneratanceinstancetime");
            return (Criteria) this;
        }

        public Criteria andVicegeneratanceinstancetimeLessThanOrEqualTo(Integer value) {
            addCriterion("viceGeneratanceInstanceTime <=", value, "vicegeneratanceinstancetime");
            return (Criteria) this;
        }

        public Criteria andVicegeneratanceinstancetimeIn(List<Integer> values) {
            addCriterion("viceGeneratanceInstanceTime in", values, "vicegeneratanceinstancetime");
            return (Criteria) this;
        }

        public Criteria andVicegeneratanceinstancetimeNotIn(List<Integer> values) {
            addCriterion("viceGeneratanceInstanceTime not in", values, "vicegeneratanceinstancetime");
            return (Criteria) this;
        }

        public Criteria andVicegeneratanceinstancetimeBetween(Integer value1, Integer value2) {
            addCriterion("viceGeneratanceInstanceTime between", value1, value2, "vicegeneratanceinstancetime");
            return (Criteria) this;
        }

        public Criteria andVicegeneratanceinstancetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("viceGeneratanceInstanceTime not between", value1, value2, "vicegeneratanceinstancetime");
            return (Criteria) this;
        }

        public Criteria andTitle0IsNull() {
            addCriterion("title_0 is null");
            return (Criteria) this;
        }

        public Criteria andTitle0IsNotNull() {
            addCriterion("title_0 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle0EqualTo(Integer value) {
            addCriterion("title_0 =", value, "title0");
            return (Criteria) this;
        }

        public Criteria andTitle0NotEqualTo(Integer value) {
            addCriterion("title_0 <>", value, "title0");
            return (Criteria) this;
        }

        public Criteria andTitle0GreaterThan(Integer value) {
            addCriterion("title_0 >", value, "title0");
            return (Criteria) this;
        }

        public Criteria andTitle0GreaterThanOrEqualTo(Integer value) {
            addCriterion("title_0 >=", value, "title0");
            return (Criteria) this;
        }

        public Criteria andTitle0LessThan(Integer value) {
            addCriterion("title_0 <", value, "title0");
            return (Criteria) this;
        }

        public Criteria andTitle0LessThanOrEqualTo(Integer value) {
            addCriterion("title_0 <=", value, "title0");
            return (Criteria) this;
        }

        public Criteria andTitle0In(List<Integer> values) {
            addCriterion("title_0 in", values, "title0");
            return (Criteria) this;
        }

        public Criteria andTitle0NotIn(List<Integer> values) {
            addCriterion("title_0 not in", values, "title0");
            return (Criteria) this;
        }

        public Criteria andTitle0Between(Integer value1, Integer value2) {
            addCriterion("title_0 between", value1, value2, "title0");
            return (Criteria) this;
        }

        public Criteria andTitle0NotBetween(Integer value1, Integer value2) {
            addCriterion("title_0 not between", value1, value2, "title0");
            return (Criteria) this;
        }

        public Criteria andTitle1IsNull() {
            addCriterion("title_1 is null");
            return (Criteria) this;
        }

        public Criteria andTitle1IsNotNull() {
            addCriterion("title_1 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle1EqualTo(Integer value) {
            addCriterion("title_1 =", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1NotEqualTo(Integer value) {
            addCriterion("title_1 <>", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1GreaterThan(Integer value) {
            addCriterion("title_1 >", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1GreaterThanOrEqualTo(Integer value) {
            addCriterion("title_1 >=", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1LessThan(Integer value) {
            addCriterion("title_1 <", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1LessThanOrEqualTo(Integer value) {
            addCriterion("title_1 <=", value, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1In(List<Integer> values) {
            addCriterion("title_1 in", values, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1NotIn(List<Integer> values) {
            addCriterion("title_1 not in", values, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1Between(Integer value1, Integer value2) {
            addCriterion("title_1 between", value1, value2, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle1NotBetween(Integer value1, Integer value2) {
            addCriterion("title_1 not between", value1, value2, "title1");
            return (Criteria) this;
        }

        public Criteria andTitle2IsNull() {
            addCriterion("title_2 is null");
            return (Criteria) this;
        }

        public Criteria andTitle2IsNotNull() {
            addCriterion("title_2 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle2EqualTo(Integer value) {
            addCriterion("title_2 =", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotEqualTo(Integer value) {
            addCriterion("title_2 <>", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2GreaterThan(Integer value) {
            addCriterion("title_2 >", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2GreaterThanOrEqualTo(Integer value) {
            addCriterion("title_2 >=", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2LessThan(Integer value) {
            addCriterion("title_2 <", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2LessThanOrEqualTo(Integer value) {
            addCriterion("title_2 <=", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2In(List<Integer> values) {
            addCriterion("title_2 in", values, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotIn(List<Integer> values) {
            addCriterion("title_2 not in", values, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2Between(Integer value1, Integer value2) {
            addCriterion("title_2 between", value1, value2, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotBetween(Integer value1, Integer value2) {
            addCriterion("title_2 not between", value1, value2, "title2");
            return (Criteria) this;
        }

        public Criteria andClientdata0IsNull() {
            addCriterion("clientData_0 is null");
            return (Criteria) this;
        }

        public Criteria andClientdata0IsNotNull() {
            addCriterion("clientData_0 is not null");
            return (Criteria) this;
        }

        public Criteria andClientdata0EqualTo(Integer value) {
            addCriterion("clientData_0 =", value, "clientdata0");
            return (Criteria) this;
        }

        public Criteria andClientdata0NotEqualTo(Integer value) {
            addCriterion("clientData_0 <>", value, "clientdata0");
            return (Criteria) this;
        }

        public Criteria andClientdata0GreaterThan(Integer value) {
            addCriterion("clientData_0 >", value, "clientdata0");
            return (Criteria) this;
        }

        public Criteria andClientdata0GreaterThanOrEqualTo(Integer value) {
            addCriterion("clientData_0 >=", value, "clientdata0");
            return (Criteria) this;
        }

        public Criteria andClientdata0LessThan(Integer value) {
            addCriterion("clientData_0 <", value, "clientdata0");
            return (Criteria) this;
        }

        public Criteria andClientdata0LessThanOrEqualTo(Integer value) {
            addCriterion("clientData_0 <=", value, "clientdata0");
            return (Criteria) this;
        }

        public Criteria andClientdata0In(List<Integer> values) {
            addCriterion("clientData_0 in", values, "clientdata0");
            return (Criteria) this;
        }

        public Criteria andClientdata0NotIn(List<Integer> values) {
            addCriterion("clientData_0 not in", values, "clientdata0");
            return (Criteria) this;
        }

        public Criteria andClientdata0Between(Integer value1, Integer value2) {
            addCriterion("clientData_0 between", value1, value2, "clientdata0");
            return (Criteria) this;
        }

        public Criteria andClientdata0NotBetween(Integer value1, Integer value2) {
            addCriterion("clientData_0 not between", value1, value2, "clientdata0");
            return (Criteria) this;
        }

        public Criteria andClientdata1IsNull() {
            addCriterion("clientData_1 is null");
            return (Criteria) this;
        }

        public Criteria andClientdata1IsNotNull() {
            addCriterion("clientData_1 is not null");
            return (Criteria) this;
        }

        public Criteria andClientdata1EqualTo(Integer value) {
            addCriterion("clientData_1 =", value, "clientdata1");
            return (Criteria) this;
        }

        public Criteria andClientdata1NotEqualTo(Integer value) {
            addCriterion("clientData_1 <>", value, "clientdata1");
            return (Criteria) this;
        }

        public Criteria andClientdata1GreaterThan(Integer value) {
            addCriterion("clientData_1 >", value, "clientdata1");
            return (Criteria) this;
        }

        public Criteria andClientdata1GreaterThanOrEqualTo(Integer value) {
            addCriterion("clientData_1 >=", value, "clientdata1");
            return (Criteria) this;
        }

        public Criteria andClientdata1LessThan(Integer value) {
            addCriterion("clientData_1 <", value, "clientdata1");
            return (Criteria) this;
        }

        public Criteria andClientdata1LessThanOrEqualTo(Integer value) {
            addCriterion("clientData_1 <=", value, "clientdata1");
            return (Criteria) this;
        }

        public Criteria andClientdata1In(List<Integer> values) {
            addCriterion("clientData_1 in", values, "clientdata1");
            return (Criteria) this;
        }

        public Criteria andClientdata1NotIn(List<Integer> values) {
            addCriterion("clientData_1 not in", values, "clientdata1");
            return (Criteria) this;
        }

        public Criteria andClientdata1Between(Integer value1, Integer value2) {
            addCriterion("clientData_1 between", value1, value2, "clientdata1");
            return (Criteria) this;
        }

        public Criteria andClientdata1NotBetween(Integer value1, Integer value2) {
            addCriterion("clientData_1 not between", value1, value2, "clientdata1");
            return (Criteria) this;
        }

        public Criteria andClientdata2IsNull() {
            addCriterion("clientData_2 is null");
            return (Criteria) this;
        }

        public Criteria andClientdata2IsNotNull() {
            addCriterion("clientData_2 is not null");
            return (Criteria) this;
        }

        public Criteria andClientdata2EqualTo(Integer value) {
            addCriterion("clientData_2 =", value, "clientdata2");
            return (Criteria) this;
        }

        public Criteria andClientdata2NotEqualTo(Integer value) {
            addCriterion("clientData_2 <>", value, "clientdata2");
            return (Criteria) this;
        }

        public Criteria andClientdata2GreaterThan(Integer value) {
            addCriterion("clientData_2 >", value, "clientdata2");
            return (Criteria) this;
        }

        public Criteria andClientdata2GreaterThanOrEqualTo(Integer value) {
            addCriterion("clientData_2 >=", value, "clientdata2");
            return (Criteria) this;
        }

        public Criteria andClientdata2LessThan(Integer value) {
            addCriterion("clientData_2 <", value, "clientdata2");
            return (Criteria) this;
        }

        public Criteria andClientdata2LessThanOrEqualTo(Integer value) {
            addCriterion("clientData_2 <=", value, "clientdata2");
            return (Criteria) this;
        }

        public Criteria andClientdata2In(List<Integer> values) {
            addCriterion("clientData_2 in", values, "clientdata2");
            return (Criteria) this;
        }

        public Criteria andClientdata2NotIn(List<Integer> values) {
            addCriterion("clientData_2 not in", values, "clientdata2");
            return (Criteria) this;
        }

        public Criteria andClientdata2Between(Integer value1, Integer value2) {
            addCriterion("clientData_2 between", value1, value2, "clientdata2");
            return (Criteria) this;
        }

        public Criteria andClientdata2NotBetween(Integer value1, Integer value2) {
            addCriterion("clientData_2 not between", value1, value2, "clientdata2");
            return (Criteria) this;
        }

        public Criteria andClientdata3IsNull() {
            addCriterion("clientData_3 is null");
            return (Criteria) this;
        }

        public Criteria andClientdata3IsNotNull() {
            addCriterion("clientData_3 is not null");
            return (Criteria) this;
        }

        public Criteria andClientdata3EqualTo(Integer value) {
            addCriterion("clientData_3 =", value, "clientdata3");
            return (Criteria) this;
        }

        public Criteria andClientdata3NotEqualTo(Integer value) {
            addCriterion("clientData_3 <>", value, "clientdata3");
            return (Criteria) this;
        }

        public Criteria andClientdata3GreaterThan(Integer value) {
            addCriterion("clientData_3 >", value, "clientdata3");
            return (Criteria) this;
        }

        public Criteria andClientdata3GreaterThanOrEqualTo(Integer value) {
            addCriterion("clientData_3 >=", value, "clientdata3");
            return (Criteria) this;
        }

        public Criteria andClientdata3LessThan(Integer value) {
            addCriterion("clientData_3 <", value, "clientdata3");
            return (Criteria) this;
        }

        public Criteria andClientdata3LessThanOrEqualTo(Integer value) {
            addCriterion("clientData_3 <=", value, "clientdata3");
            return (Criteria) this;
        }

        public Criteria andClientdata3In(List<Integer> values) {
            addCriterion("clientData_3 in", values, "clientdata3");
            return (Criteria) this;
        }

        public Criteria andClientdata3NotIn(List<Integer> values) {
            addCriterion("clientData_3 not in", values, "clientdata3");
            return (Criteria) this;
        }

        public Criteria andClientdata3Between(Integer value1, Integer value2) {
            addCriterion("clientData_3 between", value1, value2, "clientdata3");
            return (Criteria) this;
        }

        public Criteria andClientdata3NotBetween(Integer value1, Integer value2) {
            addCriterion("clientData_3 not between", value1, value2, "clientdata3");
            return (Criteria) this;
        }

        public Criteria andClientdata4IsNull() {
            addCriterion("clientData_4 is null");
            return (Criteria) this;
        }

        public Criteria andClientdata4IsNotNull() {
            addCriterion("clientData_4 is not null");
            return (Criteria) this;
        }

        public Criteria andClientdata4EqualTo(Integer value) {
            addCriterion("clientData_4 =", value, "clientdata4");
            return (Criteria) this;
        }

        public Criteria andClientdata4NotEqualTo(Integer value) {
            addCriterion("clientData_4 <>", value, "clientdata4");
            return (Criteria) this;
        }

        public Criteria andClientdata4GreaterThan(Integer value) {
            addCriterion("clientData_4 >", value, "clientdata4");
            return (Criteria) this;
        }

        public Criteria andClientdata4GreaterThanOrEqualTo(Integer value) {
            addCriterion("clientData_4 >=", value, "clientdata4");
            return (Criteria) this;
        }

        public Criteria andClientdata4LessThan(Integer value) {
            addCriterion("clientData_4 <", value, "clientdata4");
            return (Criteria) this;
        }

        public Criteria andClientdata4LessThanOrEqualTo(Integer value) {
            addCriterion("clientData_4 <=", value, "clientdata4");
            return (Criteria) this;
        }

        public Criteria andClientdata4In(List<Integer> values) {
            addCriterion("clientData_4 in", values, "clientdata4");
            return (Criteria) this;
        }

        public Criteria andClientdata4NotIn(List<Integer> values) {
            addCriterion("clientData_4 not in", values, "clientdata4");
            return (Criteria) this;
        }

        public Criteria andClientdata4Between(Integer value1, Integer value2) {
            addCriterion("clientData_4 between", value1, value2, "clientdata4");
            return (Criteria) this;
        }

        public Criteria andClientdata4NotBetween(Integer value1, Integer value2) {
            addCriterion("clientData_4 not between", value1, value2, "clientdata4");
            return (Criteria) this;
        }

        public Criteria andClientdata5IsNull() {
            addCriterion("clientData_5 is null");
            return (Criteria) this;
        }

        public Criteria andClientdata5IsNotNull() {
            addCriterion("clientData_5 is not null");
            return (Criteria) this;
        }

        public Criteria andClientdata5EqualTo(Integer value) {
            addCriterion("clientData_5 =", value, "clientdata5");
            return (Criteria) this;
        }

        public Criteria andClientdata5NotEqualTo(Integer value) {
            addCriterion("clientData_5 <>", value, "clientdata5");
            return (Criteria) this;
        }

        public Criteria andClientdata5GreaterThan(Integer value) {
            addCriterion("clientData_5 >", value, "clientdata5");
            return (Criteria) this;
        }

        public Criteria andClientdata5GreaterThanOrEqualTo(Integer value) {
            addCriterion("clientData_5 >=", value, "clientdata5");
            return (Criteria) this;
        }

        public Criteria andClientdata5LessThan(Integer value) {
            addCriterion("clientData_5 <", value, "clientdata5");
            return (Criteria) this;
        }

        public Criteria andClientdata5LessThanOrEqualTo(Integer value) {
            addCriterion("clientData_5 <=", value, "clientdata5");
            return (Criteria) this;
        }

        public Criteria andClientdata5In(List<Integer> values) {
            addCriterion("clientData_5 in", values, "clientdata5");
            return (Criteria) this;
        }

        public Criteria andClientdata5NotIn(List<Integer> values) {
            addCriterion("clientData_5 not in", values, "clientdata5");
            return (Criteria) this;
        }

        public Criteria andClientdata5Between(Integer value1, Integer value2) {
            addCriterion("clientData_5 between", value1, value2, "clientdata5");
            return (Criteria) this;
        }

        public Criteria andClientdata5NotBetween(Integer value1, Integer value2) {
            addCriterion("clientData_5 not between", value1, value2, "clientdata5");
            return (Criteria) this;
        }

        public Criteria andClientdata6IsNull() {
            addCriterion("clientData_6 is null");
            return (Criteria) this;
        }

        public Criteria andClientdata6IsNotNull() {
            addCriterion("clientData_6 is not null");
            return (Criteria) this;
        }

        public Criteria andClientdata6EqualTo(Integer value) {
            addCriterion("clientData_6 =", value, "clientdata6");
            return (Criteria) this;
        }

        public Criteria andClientdata6NotEqualTo(Integer value) {
            addCriterion("clientData_6 <>", value, "clientdata6");
            return (Criteria) this;
        }

        public Criteria andClientdata6GreaterThan(Integer value) {
            addCriterion("clientData_6 >", value, "clientdata6");
            return (Criteria) this;
        }

        public Criteria andClientdata6GreaterThanOrEqualTo(Integer value) {
            addCriterion("clientData_6 >=", value, "clientdata6");
            return (Criteria) this;
        }

        public Criteria andClientdata6LessThan(Integer value) {
            addCriterion("clientData_6 <", value, "clientdata6");
            return (Criteria) this;
        }

        public Criteria andClientdata6LessThanOrEqualTo(Integer value) {
            addCriterion("clientData_6 <=", value, "clientdata6");
            return (Criteria) this;
        }

        public Criteria andClientdata6In(List<Integer> values) {
            addCriterion("clientData_6 in", values, "clientdata6");
            return (Criteria) this;
        }

        public Criteria andClientdata6NotIn(List<Integer> values) {
            addCriterion("clientData_6 not in", values, "clientdata6");
            return (Criteria) this;
        }

        public Criteria andClientdata6Between(Integer value1, Integer value2) {
            addCriterion("clientData_6 between", value1, value2, "clientdata6");
            return (Criteria) this;
        }

        public Criteria andClientdata6NotBetween(Integer value1, Integer value2) {
            addCriterion("clientData_6 not between", value1, value2, "clientdata6");
            return (Criteria) this;
        }

        public Criteria andClientdata7IsNull() {
            addCriterion("clientData_7 is null");
            return (Criteria) this;
        }

        public Criteria andClientdata7IsNotNull() {
            addCriterion("clientData_7 is not null");
            return (Criteria) this;
        }

        public Criteria andClientdata7EqualTo(Integer value) {
            addCriterion("clientData_7 =", value, "clientdata7");
            return (Criteria) this;
        }

        public Criteria andClientdata7NotEqualTo(Integer value) {
            addCriterion("clientData_7 <>", value, "clientdata7");
            return (Criteria) this;
        }

        public Criteria andClientdata7GreaterThan(Integer value) {
            addCriterion("clientData_7 >", value, "clientdata7");
            return (Criteria) this;
        }

        public Criteria andClientdata7GreaterThanOrEqualTo(Integer value) {
            addCriterion("clientData_7 >=", value, "clientdata7");
            return (Criteria) this;
        }

        public Criteria andClientdata7LessThan(Integer value) {
            addCriterion("clientData_7 <", value, "clientdata7");
            return (Criteria) this;
        }

        public Criteria andClientdata7LessThanOrEqualTo(Integer value) {
            addCriterion("clientData_7 <=", value, "clientdata7");
            return (Criteria) this;
        }

        public Criteria andClientdata7In(List<Integer> values) {
            addCriterion("clientData_7 in", values, "clientdata7");
            return (Criteria) this;
        }

        public Criteria andClientdata7NotIn(List<Integer> values) {
            addCriterion("clientData_7 not in", values, "clientdata7");
            return (Criteria) this;
        }

        public Criteria andClientdata7Between(Integer value1, Integer value2) {
            addCriterion("clientData_7 between", value1, value2, "clientdata7");
            return (Criteria) this;
        }

        public Criteria andClientdata7NotBetween(Integer value1, Integer value2) {
            addCriterion("clientData_7 not between", value1, value2, "clientdata7");
            return (Criteria) this;
        }

        public Criteria andClientdata8IsNull() {
            addCriterion("clientData_8 is null");
            return (Criteria) this;
        }

        public Criteria andClientdata8IsNotNull() {
            addCriterion("clientData_8 is not null");
            return (Criteria) this;
        }

        public Criteria andClientdata8EqualTo(Integer value) {
            addCriterion("clientData_8 =", value, "clientdata8");
            return (Criteria) this;
        }

        public Criteria andClientdata8NotEqualTo(Integer value) {
            addCriterion("clientData_8 <>", value, "clientdata8");
            return (Criteria) this;
        }

        public Criteria andClientdata8GreaterThan(Integer value) {
            addCriterion("clientData_8 >", value, "clientdata8");
            return (Criteria) this;
        }

        public Criteria andClientdata8GreaterThanOrEqualTo(Integer value) {
            addCriterion("clientData_8 >=", value, "clientdata8");
            return (Criteria) this;
        }

        public Criteria andClientdata8LessThan(Integer value) {
            addCriterion("clientData_8 <", value, "clientdata8");
            return (Criteria) this;
        }

        public Criteria andClientdata8LessThanOrEqualTo(Integer value) {
            addCriterion("clientData_8 <=", value, "clientdata8");
            return (Criteria) this;
        }

        public Criteria andClientdata8In(List<Integer> values) {
            addCriterion("clientData_8 in", values, "clientdata8");
            return (Criteria) this;
        }

        public Criteria andClientdata8NotIn(List<Integer> values) {
            addCriterion("clientData_8 not in", values, "clientdata8");
            return (Criteria) this;
        }

        public Criteria andClientdata8Between(Integer value1, Integer value2) {
            addCriterion("clientData_8 between", value1, value2, "clientdata8");
            return (Criteria) this;
        }

        public Criteria andClientdata8NotBetween(Integer value1, Integer value2) {
            addCriterion("clientData_8 not between", value1, value2, "clientdata8");
            return (Criteria) this;
        }

        public Criteria andClientdata9IsNull() {
            addCriterion("clientData_9 is null");
            return (Criteria) this;
        }

        public Criteria andClientdata9IsNotNull() {
            addCriterion("clientData_9 is not null");
            return (Criteria) this;
        }

        public Criteria andClientdata9EqualTo(Integer value) {
            addCriterion("clientData_9 =", value, "clientdata9");
            return (Criteria) this;
        }

        public Criteria andClientdata9NotEqualTo(Integer value) {
            addCriterion("clientData_9 <>", value, "clientdata9");
            return (Criteria) this;
        }

        public Criteria andClientdata9GreaterThan(Integer value) {
            addCriterion("clientData_9 >", value, "clientdata9");
            return (Criteria) this;
        }

        public Criteria andClientdata9GreaterThanOrEqualTo(Integer value) {
            addCriterion("clientData_9 >=", value, "clientdata9");
            return (Criteria) this;
        }

        public Criteria andClientdata9LessThan(Integer value) {
            addCriterion("clientData_9 <", value, "clientdata9");
            return (Criteria) this;
        }

        public Criteria andClientdata9LessThanOrEqualTo(Integer value) {
            addCriterion("clientData_9 <=", value, "clientdata9");
            return (Criteria) this;
        }

        public Criteria andClientdata9In(List<Integer> values) {
            addCriterion("clientData_9 in", values, "clientdata9");
            return (Criteria) this;
        }

        public Criteria andClientdata9NotIn(List<Integer> values) {
            addCriterion("clientData_9 not in", values, "clientdata9");
            return (Criteria) this;
        }

        public Criteria andClientdata9Between(Integer value1, Integer value2) {
            addCriterion("clientData_9 between", value1, value2, "clientdata9");
            return (Criteria) this;
        }

        public Criteria andClientdata9NotBetween(Integer value1, Integer value2) {
            addCriterion("clientData_9 not between", value1, value2, "clientdata9");
            return (Criteria) this;
        }

        public Criteria andGuessgoldIsNull() {
            addCriterion("guessgold is null");
            return (Criteria) this;
        }

        public Criteria andGuessgoldIsNotNull() {
            addCriterion("guessgold is not null");
            return (Criteria) this;
        }

        public Criteria andGuessgoldEqualTo(Integer value) {
            addCriterion("guessgold =", value, "guessgold");
            return (Criteria) this;
        }

        public Criteria andGuessgoldNotEqualTo(Integer value) {
            addCriterion("guessgold <>", value, "guessgold");
            return (Criteria) this;
        }

        public Criteria andGuessgoldGreaterThan(Integer value) {
            addCriterion("guessgold >", value, "guessgold");
            return (Criteria) this;
        }

        public Criteria andGuessgoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("guessgold >=", value, "guessgold");
            return (Criteria) this;
        }

        public Criteria andGuessgoldLessThan(Integer value) {
            addCriterion("guessgold <", value, "guessgold");
            return (Criteria) this;
        }

        public Criteria andGuessgoldLessThanOrEqualTo(Integer value) {
            addCriterion("guessgold <=", value, "guessgold");
            return (Criteria) this;
        }

        public Criteria andGuessgoldIn(List<Integer> values) {
            addCriterion("guessgold in", values, "guessgold");
            return (Criteria) this;
        }

        public Criteria andGuessgoldNotIn(List<Integer> values) {
            addCriterion("guessgold not in", values, "guessgold");
            return (Criteria) this;
        }

        public Criteria andGuessgoldBetween(Integer value1, Integer value2) {
            addCriterion("guessgold between", value1, value2, "guessgold");
            return (Criteria) this;
        }

        public Criteria andGuessgoldNotBetween(Integer value1, Integer value2) {
            addCriterion("guessgold not between", value1, value2, "guessgold");
            return (Criteria) this;
        }

        public Criteria andTigerSymbolIsNull() {
            addCriterion("tiger_symbol is null");
            return (Criteria) this;
        }

        public Criteria andTigerSymbolIsNotNull() {
            addCriterion("tiger_symbol is not null");
            return (Criteria) this;
        }

        public Criteria andTigerSymbolEqualTo(Integer value) {
            addCriterion("tiger_symbol =", value, "tigerSymbol");
            return (Criteria) this;
        }

        public Criteria andTigerSymbolNotEqualTo(Integer value) {
            addCriterion("tiger_symbol <>", value, "tigerSymbol");
            return (Criteria) this;
        }

        public Criteria andTigerSymbolGreaterThan(Integer value) {
            addCriterion("tiger_symbol >", value, "tigerSymbol");
            return (Criteria) this;
        }

        public Criteria andTigerSymbolGreaterThanOrEqualTo(Integer value) {
            addCriterion("tiger_symbol >=", value, "tigerSymbol");
            return (Criteria) this;
        }

        public Criteria andTigerSymbolLessThan(Integer value) {
            addCriterion("tiger_symbol <", value, "tigerSymbol");
            return (Criteria) this;
        }

        public Criteria andTigerSymbolLessThanOrEqualTo(Integer value) {
            addCriterion("tiger_symbol <=", value, "tigerSymbol");
            return (Criteria) this;
        }

        public Criteria andTigerSymbolIn(List<Integer> values) {
            addCriterion("tiger_symbol in", values, "tigerSymbol");
            return (Criteria) this;
        }

        public Criteria andTigerSymbolNotIn(List<Integer> values) {
            addCriterion("tiger_symbol not in", values, "tigerSymbol");
            return (Criteria) this;
        }

        public Criteria andTigerSymbolBetween(Integer value1, Integer value2) {
            addCriterion("tiger_symbol between", value1, value2, "tigerSymbol");
            return (Criteria) this;
        }

        public Criteria andTigerSymbolNotBetween(Integer value1, Integer value2) {
            addCriterion("tiger_symbol not between", value1, value2, "tigerSymbol");
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