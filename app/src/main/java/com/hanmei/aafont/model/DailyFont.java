package com.hanmei.aafont.model;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;

public class DailyFont extends BmobObject {
    private BmobFile content;

    public BmobFile getContent() {
        return content;
    }
    public void setContent(BmobFile content) {
        this.content = content;
    }

}
