package com.jason.zero.enums;


/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 *
 * @author 文远（wenyuan@maihaoche.com）
 * @version 1.0
 * @since 1.0
 */
public enum EPlatform {
    /**
     * Any e platform.
     */
    Any("any"),
    /**
     * Linux e platform.
     */
    Linux("Linux"),
    /**
     * The Mac os.
     */
    Mac_OS("Mac OS"),
    /**
     * The Mac os x.
     */
    Mac_OS_X("Mac OS X"),
    /**
     * Windows e platform.
     */
    Windows("Windows"),
    /**
     * Os 2 e platform.
     */
    OS2("OS/2"),
    /**
     * Solaris e platform.
     */
    Solaris("Solaris"),
    /**
     * Sun os e platform.
     */
    SunOS("SunOS"),
    /**
     * Mp ei x e platform.
     */
    MPEiX("MPE/iX"),
    /**
     * Hp ux e platform.
     */
    HP_UX("HP-UX"),
    /**
     * Aix e platform.
     */
    AIX("AIX"),
    /**
     * Os 390 e platform.
     */
    OS390("OS/390"),
    /**
     * Free bsd e platform.
     */
    FreeBSD("FreeBSD"),
    /**
     * Irix e platform.
     */
    Irix("Irix"),
    /**
     * The Digital unix.
     */
    Digital_Unix("Digital Unix"),
    /**
     * Net ware 411 e platform.
     */
    NetWare_411("NetWare"),
    /**
     * Osf 1 e platform.
     */
    OSF1("OSF1"),
    /**
     * Open vms e platform.
     */
    OpenVMS("OpenVMS"),
    /**
     * Others e platform.
     */
    Others("Others");

    private EPlatform(String desc){
        this.description = desc;
    }

    @Override
    public String toString(){
        return description;
    }

    private String description;
}

