package com.example.ANNAMATH;

import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;

@Tag("video")
public class Video extends HtmlContainer {
    private static final PropertyDescriptor<String, String> srcDescriptor = PropertyDescriptors.attributeWithDefault("src" , "");


    public Video() {
        super();
        getElement().setProperty("controls", true);
    }

    public Video(String src) {
        setSrc(src);
        getElement().setProperty(VideoAttributes.Controls, true);
        getElement().setProperty("muted", true);
        getElement().setProperty(VideoAttributes.AutoPlay, true);
        getElement().setProperty(VideoAttributes.Loop, true);

    }

    public String getSrc() {
        return get(srcDescriptor);
    }

    public void setSrc(String src) {
        set(srcDescriptor, src);
    }
    private interface VideoAttributes {
        String CrossOrigin = "crossorigin";
        String Controls = "controls";
        String Source = "src";
        String AutoPlay = "autoplay";
        String Loop = "loop";
        String Preload = "preload";
        String Poster = "poster";
        String Width = "width";
        String Height = "height";

    }

    public interface PreloadType {
        String Auto = "auto";
        String MetaData = "metadata";
        String None = "none";
    }
}
