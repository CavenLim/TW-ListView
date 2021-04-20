package com.myapplicationdev.android.tw_listview;

public class Module {


        private String moduleCode;
        private boolean isImage;
        public Module( String moduleCode, boolean isImage) {
            this.moduleCode = moduleCode;
            this.isImage=isImage;
        }

        public String getModuleCode() {
            return moduleCode;
        }
        public boolean getIsImage(){
            return isImage;
        }


}
