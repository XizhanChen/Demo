package com.xizhan.dto.exception;

import com.xizhan.dao.PaperFileMapper;
import com.xizhan.dto.enums.StateEnum;

/**
 * @author shkstart
 * @create 2022-04-14 21:51
 */
public class AddException {

    private String name;

    private int state;

    private String stateInfo;

    private PaperFileMapper paperFileMapper;

    public AddException() {
    }

    public AddException(String name, StateEnum stateEnum) {
        this.name = name;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    public AddException(String name, StateEnum stateEnum, PaperFileMapper paperFileMapper) {
        this.name = name;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.paperFileMapper = paperFileMapper;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public PaperFileMapper getPaperFileMapper() {
        return paperFileMapper;
    }

    public void setPaperFileMapper(PaperFileMapper paperFileMapper) {
        this.paperFileMapper = paperFileMapper;
    }

    @Override
    public String toString() {
        return "AddException{" +
                "name='" + name + '\'' +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", paperFileMapper=" + paperFileMapper +
                '}';
    }
}
