package com.rl.notekeeper;

import java.util.ArrayList;
import java.util.List;

public class DataManager {


    private static DataManager myInstance = null;


    List<CourseInfo> mCourses = new ArrayList<>();
    List<NoteInfo> mNotes = new ArrayList<>();


    public static DataManager getInstance() {

        if (myInstance == null) {

            myInstance = new DataManager();
            myInstance.initializeCourses();
            myInstance.initializeNotes();
            myInstance.initialExampleNotes();

        }


        return myInstance;
    }


    public List<NoteInfo> getmNotes() {
        return mNotes;
    }


    public List<CourseInfo> getmCourses(){
        return  mCourses;
    }


    public CourseInfo getCourses(String id) {

        for (CourseInfo courseInfo : mCourses) {

            if (id.equals(courseInfo.getmCourseId()))
                return courseInfo;

        }

        return null;

    }


    //Initialize Course Details

    private void initializeCourses() {

        mCourses.add(initCourse1());
        mCourses.add(initCourse2());
        mCourses.add(initCourse3());
        mCourses.add(initCourse4());

    }


    public void initialExampleNotes() {

        final DataManager dm = getInstance();


        CourseInfo courseInfo = dm.getCourses("android_intents");

        courseInfo.getModules("android_intents_m01").setmIsComplete(true);
        courseInfo.getModules("android_intents_m02").setmIsComplete(true);
        courseInfo.getModules("android_intents_m03").setmIsComplete(true);
        mNotes.add(new NoteInfo(courseInfo, "Intent dynamic", "Intents are really good components"));


    }


    public void initializeNotes() {


        final DataManager dm = getInstance();

        CourseInfo courseInfo = dm.getCourses("android_intents");
        courseInfo.getModules("android_intents_m01").setmIsComplete(true);
        courseInfo.getModules("android_intents_m02").setmIsComplete(true);
        courseInfo.getModules("android_intents_m03").setmIsComplete(true);
        courseInfo.getModules("android_intents_m04").setmIsComplete(true);
        courseInfo.getModules("android_intents_m05").setmIsComplete(true);


    }


    private CourseInfo initCourse1() {

        List<ModuleInfo> moduleInfos = new ArrayList<>();

        moduleInfos.add(new ModuleInfo("android_intents_m01", "Android Intents and Binding"));
        moduleInfos.add(new ModuleInfo("android_intents_m02", "Components of Activities"));
        moduleInfos.add(new ModuleInfo("android_intents_m03", "Intent Filter data tests"));
        moduleInfos.add(new ModuleInfo("android_intents_m04", "Intent Filter and platform features"));
        moduleInfos.add(new ModuleInfo("android_intents_m05", "platform features through intents"));

        return new CourseInfo("android_intents", "Android Programming with Intents", moduleInfos);

    }

    private CourseInfo initCourse2() {

        List<ModuleInfo> moduleInfos = new ArrayList<>();

        moduleInfos.add(new ModuleInfo("android_intents_m01", "Android Intents and Binding"));
        moduleInfos.add(new ModuleInfo("android_intents_m02", "Components of Activities"));
        moduleInfos.add(new ModuleInfo("android_intents_m03", "Intent Filter data tests"));
        moduleInfos.add(new ModuleInfo("android_intents_m04", "Intent Filter and platform features"));
        moduleInfos.add(new ModuleInfo("android_intents_m05", "platform features through intents"));

        return new CourseInfo("android_intents", "Android Programming Services", moduleInfos);

    }

    private CourseInfo initCourse3() {

        List<ModuleInfo> moduleInfos = new ArrayList<>();

        moduleInfos.add(new ModuleInfo("android_intents_m01", "Android Intents and Binding"));
        moduleInfos.add(new ModuleInfo("android_intents_m02", "Components of Activities"));
        moduleInfos.add(new ModuleInfo("android_intents_m03", "Intent Filter data tests"));
        moduleInfos.add(new ModuleInfo("android_intents_m04", "Intent Filter and platform features"));
        moduleInfos.add(new ModuleInfo("android_intents_m05", "platform features through intents"));

        return new CourseInfo("android_intents", "Android Programming with Broadcast", moduleInfos);

    }

    private CourseInfo initCourse4() {

        List<ModuleInfo> moduleInfos = new ArrayList<>();

        moduleInfos.add(new ModuleInfo("android_intents_m01", "Android Intents and Binding"));
        moduleInfos.add(new ModuleInfo("android_intents_m02", "Components of Activities"));
        moduleInfos.add(new ModuleInfo("android_intents_m03", "Intent Filter data tests"));
        moduleInfos.add(new ModuleInfo("android_intents_m04", "Intent Filter and platform features"));
        moduleInfos.add(new ModuleInfo("android_intents_m05", "platform features through intents"));

        return new CourseInfo("android_intents", "Android Programming with Jetpack components", moduleInfos);

    }


}
