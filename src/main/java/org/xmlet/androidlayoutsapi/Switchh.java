package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class Switchh<Z extends Element> implements CustomAttributeGroup<Switchh<Z>, Z>, TextGroup<Switchh<Z>, Z>, CompoundButtonHierarchyInterface<Switchh<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Switchh(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSwitchh(this);
   }

   public Switchh(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSwitchh(this);
   }

   protected Switchh(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSwitchh(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSwitchh(this);
      return this.parent;
   }

   public final Switchh<Z> dynamic(Consumer<Switchh<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Switchh<Z> of(Consumer<Switchh<Z>> consumer) {
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
      return "switchh";
   }

   public final Switchh<Z> self() {
      return this;
   }

   public final Switchh<Z> attrSwitchMinWidth(String attrSwitchMinWidth) {
      this.visitor.visitAttributeSwitchMinWidth(attrSwitchMinWidth);
      return this;
   }

   public final Switchh<Z> attrSwitchPadding(String attrSwitchPadding) {
      this.visitor.visitAttributeSwitchPadding(attrSwitchPadding);
      return this;
   }

   public final Switchh<Z> attrSwitchTextAppearance(String attrSwitchTextAppearance) {
      this.visitor.visitAttributeSwitchTextAppearance(attrSwitchTextAppearance);
      return this;
   }

   public final Switchh<Z> attrTextOff(String attrTextOff) {
      this.visitor.visitAttributeTextOff(attrTextOff);
      return this;
   }

   public final Switchh<Z> attrTextOn(String attrTextOn) {
      this.visitor.visitAttributeTextOn(attrTextOn);
      return this;
   }

   public final Switchh<Z> attrThumb(String attrThumb) {
      this.visitor.visitAttributeThumb(attrThumb);
      return this;
   }

   public final Switchh<Z> attrThumbTextPadding(String attrThumbTextPadding) {
      this.visitor.visitAttributeThumbTextPadding(attrThumbTextPadding);
      return this;
   }

   public final Switchh<Z> attrTrack(String attrTrack) {
      this.visitor.visitAttributeTrack(attrTrack);
      return this;
   }
}
