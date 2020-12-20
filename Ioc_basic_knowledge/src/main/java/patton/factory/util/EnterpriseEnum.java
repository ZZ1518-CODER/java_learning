package patton.factory.util;


public enum EnterpriseEnum {

    HP("hp", "惠普厂商"),
    DELL("dell", "戴尔厂商");

    private String code;
    private String desc;
    EnterpriseEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static EnterpriseEnum getByCode(String code) {
        for (EnterpriseEnum enterpriseEnum : values()) {
            if(enterpriseEnum.code.equalsIgnoreCase(code)) {
                return enterpriseEnum;
            }
        }
        return null;
    }
}
