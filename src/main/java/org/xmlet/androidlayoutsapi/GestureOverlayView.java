package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class GestureOverlayView<Z extends Element> implements CustomAttributeGroup<GestureOverlayView<Z>, Z>, TextGroup<GestureOverlayView<Z>, Z>, FrameLayoutHierarchyInterface<GestureOverlayView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public GestureOverlayView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementGestureOverlayView(this);
   }

   public GestureOverlayView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementGestureOverlayView(this);
   }

   protected GestureOverlayView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementGestureOverlayView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentGestureOverlayView(this);
      return this.parent;
   }

   public final GestureOverlayView<Z> dynamic(Consumer<GestureOverlayView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final GestureOverlayView<Z> of(Consumer<GestureOverlayView<Z>> consumer) {
      consumer.accept(this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "gestureOverlayView";
   }

   public final GestureOverlayView<Z> self() {
      return this;
   }

   public final GestureOverlayView<Z> attrEventsInterceptionEnabled(String attrEventsInterceptionEnabled) {
      this.visitor.visitAttributeEventsInterceptionEnabled(attrEventsInterceptionEnabled);
      return this;
   }

   public final GestureOverlayView<Z> attrFadeDuration(String attrFadeDuration) {
      this.visitor.visitAttributeFadeDuration(attrFadeDuration);
      return this;
   }

   public final GestureOverlayView<Z> attrFadeEnabled(String attrFadeEnabled) {
      this.visitor.visitAttributeFadeEnabled(attrFadeEnabled);
      return this;
   }

   public final GestureOverlayView<Z> attrFadeOffset(String attrFadeOffset) {
      this.visitor.visitAttributeFadeOffset(attrFadeOffset);
      return this;
   }

   public final GestureOverlayView<Z> attrGestureColor(String attrGestureColor) {
      this.visitor.visitAttributeGestureColor(attrGestureColor);
      return this;
   }

   public final GestureOverlayView<Z> attrGestureStrokeAngleThreshold(String attrGestureStrokeAngleThreshold) {
      this.visitor.visitAttributeGestureStrokeAngleThreshold(attrGestureStrokeAngleThreshold);
      return this;
   }

   public final GestureOverlayView<Z> attrGestureStrokeLengthThreshold(String attrGestureStrokeLengthThreshold) {
      this.visitor.visitAttributeGestureStrokeLengthThreshold(attrGestureStrokeLengthThreshold);
      return this;
   }

   public final GestureOverlayView<Z> attrGestureStrokeSquarenessThreshold(String attrGestureStrokeSquarenessThreshold) {
      this.visitor.visitAttributeGestureStrokeSquarenessThreshold(attrGestureStrokeSquarenessThreshold);
      return this;
   }

   public final GestureOverlayView<Z> attrGestureStrokeType(String attrGestureStrokeType) {
      this.visitor.visitAttributeGestureStrokeType(attrGestureStrokeType);
      return this;
   }

   public final GestureOverlayView<Z> attrGestureStrokeWidth(String attrGestureStrokeWidth) {
      this.visitor.visitAttributeGestureStrokeWidth(attrGestureStrokeWidth);
      return this;
   }

   public final GestureOverlayView<Z> attrOrientation(EnumOrientationGestureOverlayView attrOrientation) {
      this.visitor.visitAttributeOrientation(attrOrientation.getValue());
      return this;
   }

   public final GestureOverlayView<Z> attrUncertainGestureColor(String attrUncertainGestureColor) {
      this.visitor.visitAttributeUncertainGestureColor(attrUncertainGestureColor);
      return this;
   }
}
