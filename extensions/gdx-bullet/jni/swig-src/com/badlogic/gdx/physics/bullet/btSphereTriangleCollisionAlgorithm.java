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

public class btSphereTriangleCollisionAlgorithm extends btActivatingCollisionAlgorithm {
  private long swigCPtr;

  protected btSphereTriangleCollisionAlgorithm(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btSphereTriangleCollisionAlgorithm_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btSphereTriangleCollisionAlgorithm obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btSphereTriangleCollisionAlgorithm(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btSphereTriangleCollisionAlgorithm(btPersistentManifold mf, btCollisionAlgorithmConstructionInfo ci, SWIGTYPE_p_btCollisionObjectWrapper body0Wrap, SWIGTYPE_p_btCollisionObjectWrapper body1Wrap, boolean swapped) {
    this(gdxBulletJNI.new_btSphereTriangleCollisionAlgorithm__SWIG_0(btPersistentManifold.getCPtr(mf), mf, btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci, SWIGTYPE_p_btCollisionObjectWrapper.getCPtr(body0Wrap), SWIGTYPE_p_btCollisionObjectWrapper.getCPtr(body1Wrap), swapped), true);
  }

  public btSphereTriangleCollisionAlgorithm(btCollisionAlgorithmConstructionInfo ci) {
    this(gdxBulletJNI.new_btSphereTriangleCollisionAlgorithm__SWIG_1(btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci), true);
  }

}
