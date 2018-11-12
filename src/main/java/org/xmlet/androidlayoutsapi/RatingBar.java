package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class RatingBar<Z extends Element> implements CustomAttributeGroup<RatingBar<Z>, Z>, TextGroup<RatingBar<Z>, Z>, AbsSeekBarHierarchyInterface<RatingBar<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public RatingBar(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRatingBar(this);
   }

   public RatingBar(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRatingBar(this);
   }

   protected RatingBar(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRatingBar(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRatingBar(this);
      return this.parent;
   }

   public final RatingBar<Z> dynamic(Consumer<RatingBar<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final RatingBar<Z> of(Consumer<RatingBar<Z>> consumer) {
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
      return "ratingBar";
   }

   public final RatingBar<Z> self() {
      return this;
   }

   public final RatingBar<Z> attrIsIndicator(String attrIsIndicator) {
      this.visitor.visitAttributeIsIndicator(attrIsIndicator);
      return this;
   }

   public final RatingBar<Z> attrNumStars(String attrNumStars) {
      this.visitor.visitAttributeNumStars(attrNumStars);
      return this;
   }

   public final RatingBar<Z> attrRating(String attrRating) {
      this.visitor.visitAttributeRating(attrRating);
      return this;
   }

   public final RatingBar<Z> attrStepSize(String attrStepSize) {
      this.visitor.visitAttributeStepSize(attrStepSize);
      return this;
   }
}
