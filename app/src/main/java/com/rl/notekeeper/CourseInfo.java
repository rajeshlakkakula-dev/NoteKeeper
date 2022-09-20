package com.rl.notekeeper;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class CourseInfo implements Parcelable {


    public String getmCourseId() {
        return mCourseId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public ModuleInfo getModules(String moduleId) {

        for (ModuleInfo moduleInfo : mModules) {
            if (moduleId.equals(moduleInfo.getmModuleId()))
                return moduleInfo;
        }
        return null;
    }

    private final String mCourseId;
    private final String mTitle;
    private final List<ModuleInfo> mModules;

    public CourseInfo(String mCourseId, String mTitle, List<ModuleInfo> mModules) {
        this.mCourseId = mCourseId;
        this.mTitle = mTitle;
        this.mModules = mModules;
    }


    protected CourseInfo(Parcel in) {
        mCourseId = in.readString();
        mTitle = in.readString();
        mModules = in.createTypedArrayList(ModuleInfo.CREATOR);
    }

    public static final Creator<CourseInfo> CREATOR = new Creator<CourseInfo>() {
        @Override
        public CourseInfo createFromParcel(Parcel in) {
            return new CourseInfo(in);
        }

        @Override
        public CourseInfo[] newArray(int size) {
            return new CourseInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mCourseId);
        parcel.writeString(mTitle);
        parcel.writeTypedList(mModules);
    }
}




