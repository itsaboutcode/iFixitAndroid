package com.dozuki.ifixit.guide_view.model;

import java.io.Serializable;
import java.util.ArrayList;

import com.dozuki.ifixit.MainApplication;
import com.dozuki.ifixit.R;

public class GuideStep implements Serializable {
   private static final long serialVersionUID = 2884598684003517264L;

   protected int mStepNum;
   protected String mTitle;
   protected ArrayList<StepImage> mImages;
   protected ArrayList<StepLine> mLines;
   protected StepVideo mVideo;
   private Embed mEmbed;

   public GuideStep(int stepNum) {
      mStepNum = stepNum;
      mImages = new ArrayList<StepImage>();
      mLines = new ArrayList<StepLine>();
   }

   public void setTitle(String title) {
      mTitle = title;
   }

   public String getTitle() {
      if (mTitle.length() == 0) {
         mTitle = MainApplication.get().getResources().getString(R.string.step) + " " + mStepNum;
      }
      
      return mTitle;
   }

   public int getStepNum() {
      return mStepNum;
   }
   
   public boolean hasImage() {
      return mImages.size() > 0;
   }

   public void addImage(StepImage image) {
      mImages.add(image);
   }

   public ArrayList<StepImage> getImages() {
      return mImages;
   }

   public ArrayList<StepLine> getLines() {
      return mLines;
   }

   public void addLine(StepLine line) {
      mLines.add(line);
   }

   public StepLine getLine(int pos) {
      return mLines.get(pos);
   }


   public void addVideo(StepVideo stepvid) {
      mVideo = stepvid;
   }

   public boolean hasVideo() {
      return mVideo != null;
   }

   public StepVideo getVideo() {
      return mVideo;
   }

   public void addEmbed(Embed parseEmbed) {
      mEmbed = parseEmbed;
   }

   public boolean hasEmbed() {
      return mEmbed != null;
   }

   public Embed getEmbed() {
      return mEmbed;
   }

   public String toString() {
      return "{GuideStep: " + mStepNum + ", " + mTitle +  ", " + mLines +
       ", " + mImages + "}";
   }
}
