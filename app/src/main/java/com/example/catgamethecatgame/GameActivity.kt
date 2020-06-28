package com.example.catgamethecatgame

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Point
import android.util.Log
import android.view.MotionEvent
import android.view.SurfaceView

class GameView (context: Context, private val size: Point) : SurfaceView(context), Runnable {
    private val gameThread = Thread(this)
    private var playing = false
    private var paused = true
    private var canvas: Canvas = Canvas()
    private val paint: Paint = Paint()

    override fun run() {
        var fps: Long = 0
        while (playing) {
            val startFrameTime = System.currentTimeMillis()
            if (!paused) {
                update(fps)
            }

            draw()

            val timeThisFrame = System.currentTimeMillis() - startFrameTime
            if (timeThisFrame >= 1) {
                fps = 1000 / timeThisFrame
            }
        }
    }

    private fun update(fps: Long) {
        // TODO
    }

    private fun draw() {
        if (holder.surface.isValid) {
            canvas = holder.lockCanvas()

            // TODO

            holder.unlockCanvasAndPost(canvas)
        }
    }

    fun pause() {
        playing = false
        try {
            gameThread.join()
        } catch (e: InterruptedException) {
            Log.e("Error:", "joining thread")
        }
    }

    fun resume() {
        playing = true
        gameThread.start()
    }

    override fun onTouchEvent(motionEvent: MotionEvent): Boolean {

        return true
    }
}