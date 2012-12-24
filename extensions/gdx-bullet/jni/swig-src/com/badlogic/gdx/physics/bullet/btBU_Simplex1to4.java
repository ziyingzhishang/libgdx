/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btBU_Simplex1to4 extends btPolyhedralConvexAabbCachingShape {
  private long swigCPtr;

  protected btBU_Simplex1to4(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btBU_Simplex1to4_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btBU_Simplex1to4 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btBU_Simplex1to4(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btBU_Simplex1to4() {
    this(gdxBulletJNI.new_btBU_Simplex1to4__SWIG_0(), true);
  }

  public btBU_Simplex1to4(Vector3 pt0) {
    this(gdxBulletJNI.new_btBU_Simplex1to4__SWIG_1(pt0), true);
  }

  public btBU_Simplex1to4(Vector3 pt0, Vector3 pt1) {
    this(gdxBulletJNI.new_btBU_Simplex1to4__SWIG_2(pt0, pt1), true);
  }

  public btBU_Simplex1to4(Vector3 pt0, Vector3 pt1, Vector3 pt2) {
    this(gdxBulletJNI.new_btBU_Simplex1to4__SWIG_3(pt0, pt1, pt2), true);
  }

  public btBU_Simplex1to4(Vector3 pt0, Vector3 pt1, Vector3 pt2, Vector3 pt3) {
    this(gdxBulletJNI.new_btBU_Simplex1to4__SWIG_4(pt0, pt1, pt2, pt3), true);
  }

  public void reset() {
    gdxBulletJNI.btBU_Simplex1to4_reset(swigCPtr, this);
  }

  public void addVertex(Vector3 pt) {
    gdxBulletJNI.btBU_Simplex1to4_addVertex(swigCPtr, this, pt);
  }

  public int getIndex(int i) {
    return gdxBulletJNI.btBU_Simplex1to4_getIndex(swigCPtr, this, i);
  }

}
