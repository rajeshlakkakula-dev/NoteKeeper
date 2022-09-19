package com.rl.notekeeper;

import android.os.Parcel;
import android.os.Parcelable;

public class ModuleInfo implements Parcelable {


    private final  String mModuleId;
    private final  String mTitle;
    private boolean mIsComplete= false;


    protected ModuleInfo(Parcel in) {
        mModuleId = in.readString();
        mTitle = in.readString();
        mIsComplete = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mModuleId);
        dest.writeString(mTitle);
        dest.writeByte((byte) (mIsComplete ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ModuleInfo> CREATOR = new Creator<ModuleInfo>() {
        @Override
        public ModuleInfo createFromParcel(Parcel in) {
            return new ModuleInfo(in);
        }

        @Override
        public ModuleInfo[] newArray(int size) {
            return new ModuleInfo[size];
        }
    };
}
