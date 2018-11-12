package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class AbsSeekBar<Z extends Element> implements CustomAttributeGroup<AbsSeekBar<Z>, Z>, TextGroup<AbsSeekBar<Z>, Z>, ProgressBarHierarchyInterface<AbsSeekBar<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AbsSeekBar(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAbsSeekBar(this);
   }

   public AbsSeekBar(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAbsSeekBar(this);
   }

   protected AbsSeekBar(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAbsSeekBar(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAbsSeekBar(this);
      return this.parent;
   }

   public final AbsSeekBar<Z> dynamic(Consumer<AbsSeekBar<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AbsSeekBar<Z> of(Consumer<AbsSeekBar<Z>> consumer) {
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
      return "absSeekBar";
   }

   public final AbsSeekBar<Z> self() {
      return this;
   }
}
