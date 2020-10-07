package com.husttwj.opengl.triangle;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Description ：
 * Created by hust_twj on 2020/10/7.
 */
public class MyGLSurfaceView extends GLSurfaceView {

    //private final TriggerRender mRenderer;
    private final Triangle mRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);
        // 创建OpenGL ES 2.0的上下文
        setEGLContextClientVersion(2);
        //mRenderer = new TriggerRender();
        mRenderer = new Triangle();

        //设置Renderer用于绘图
        setRenderer(mRenderer);
        //只有在绘制数据改变时才绘制view，可以防止GLSurfaceView帧重绘
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

}
