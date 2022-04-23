package com.xizhan.dto.enums;

/**
 * @author shkstart
 * @create 2022-04-14 21:30
 */
public enum StateEnum {

    SUCCESS(1, "添加成功"), REPEAT_ADD(-1, "重复添加");

    private int state;

    private String stateInfo;

    private StateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static StateEnum stateOf(int index) {
        for (StateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

}
