package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class FrameLayout<Z extends Element> implements CustomAttributeGroup<FrameLayout<Z>, Z>, TextGroup<FrameLayout<Z>, Z>, ViewGroupHierarchyInterface<FrameLayout<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public FrameLayout(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementFrameLayout(this);
   }

   public FrameLayout(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementFrameLayout(this);
   }

   protected FrameLayout(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementFrameLayout(this);
      }

   }

   public Z __() {
      this.visitor.visitParentFrameLayout(this);
      return this.parent;
   }

   public final FrameLayout<Z> dynamic(Consumer<FrameLayout<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final FrameLayout<Z> of(Consumer<FrameLayout<Z>> consumer) {
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
      return "frameLayout";
   }

   public final FrameLayout<Z> self() {
      return this;
   }

   public final FrameLayout<Z> attrForeground(String attrForeground) {
      this.visitor.visitAttributeForeground(attrForeground);
      return this;
   }

   public final FrameLayout<Z> attrForegroundGravity(String attrForegroundGravity) {
      this.visitor.visitAttributeForegroundGravity(attrForegroundGravity);
      return this;
   }

   public final FrameLayout<Z> attrMeasureAllChildren(String attrMeasureAllChildren) {
      this.visitor.visitAttributeMeasureAllChildren(attrMeasureAllChildren);
      return this;
   }
}
