cmake_minimum_required(VERSION 3.4.1)

#当前工程名称
project(TraceCanary)

#用于头文件目录添加,注意必须是绝对路径，否则可能编译不过
include_directories(src/main/cpp)

add_library(trace-canary
            SHARED
        src/main/cpp/MatrixTracer.cc
        src/main/cpp/SignalHandler.cc
        src/main/cpp/Support.cc
        src/main/cpp/AnrDumper.cc
        src/main/cpp/TouchEventTracer.cc
        src/main/cpp/nativehelper/managed_jnienv.cc
             )

#指定目标包含的头文件路径。官方文档
target_include_directories(
        trace-canary
        PRIVATE ${CMAKE_SOURCE_DIR}/src/main/cpp/include
)

# 导入静态库
add_library(libsemi_dlfcn STATIC IMPORTED)
# 开始真正导入 静态库   System.loadLibrary("getndk"); // 如果是动态库，这里需要加载，否则注释
set_target_properties(libsemi_dlfcn PROPERTIES IMPORTED_LOCATION ${CMAKE_SOURCE_DIR}/src/main/cpp/jniLibs/${CMAKE_ANDROID_ARCH_ABI}/libsemi_dlfcn.a)

# 导入静态库
add_library(libxhook STATIC IMPORTED)
# 开始真正导入 静态库   System.loadLibrary("getndk"); // 如果是动态库，这里需要加载，否则注释
set_target_properties(libxhook PROPERTIES IMPORTED_LOCATION ${CMAKE_SOURCE_DIR}/src/main/cpp/jniLibs/${CMAKE_ANDROID_ARCH_ABI}/libxhook.a)

add_library(libwechatbacktrace SHARED IMPORTED)
set_target_properties(fmod PROPERTIES
        IMPORTED_LOCATION ${CMAKE_SOURCE_DIR}/jniLibs/${CMAKE_ANDROID_ARCH_ABI}/src/main/cpp/jniLibs/libwechatbacktrace.so)

find_library( log-lib
              log )


target_link_libraries( trace-canary
        libsemi_dlfcn
        libxhook
        libwechatbacktrace
        )

