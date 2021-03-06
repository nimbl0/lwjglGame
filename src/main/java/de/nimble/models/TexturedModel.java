package de.nimble.models;

import de.nimble.textures.ModelTexture;

public class TexturedModel {

    private RawModel rawModel;
    private ModelTexture texture;

    public TexturedModel(RawModel model, ModelTexture texture) {
        this.rawModel = model;
        this.texture = texture;
    }

    public RawModel getRawModel() {
        return this.rawModel;
    }

    public ModelTexture getTexture() {
        return this.texture;
    }

}
