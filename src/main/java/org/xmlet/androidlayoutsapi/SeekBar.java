package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class SeekBar<Z extends Element> implements CustomAttributeGroup<SeekBar<Z>, Z>, TextGroup<SeekBar<Z>, Z>, AbsSeekBarHierarchyInterface<SeekBar<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public SeekBar(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSeekBar(this);
   }

   public SeekBar(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSeekBar(this);
   }

   protected SeekBar(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSeekBar(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSeekBar(this);
      return this.parent;
   }

   public final SeekBar<Z> dynamic(Consumer<SeekBar<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final SeekBar<Z> of(Consumer<SeekBar<Z>> consumer) {
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
      return "seekBar";
   }

   public final SeekBar<Z> self() {
      return this;
   }

   public final SeekBar<Z> attrThumb(String attrThumb) {
      this.visitor.visitAttributeThumb(attrThumb);
      return this;
   }

   public final SeekBar<Z> attrThumbOffset(String attrThumbOffset) {
      this.visitor.visitAttributeThumbOffset(attrThumbOffset);
      return this;
   }
}
