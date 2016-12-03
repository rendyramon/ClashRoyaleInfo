
package com.example.seba_note.clashroyaleinfo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Card {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("idName")
    @Expose
    private String idName;
    @SerializedName("rarity")
    @Expose
    private String rarity;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("arena")
    @Expose
    private Integer arena;
    @SerializedName("elixirCost")
    @Expose
    private Integer elixirCost;
    @SerializedName("__v")
    @Expose
    private Integer v;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The _id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The idName
     */
    public String getIdName() {
        return idName;
    }

    /**
     * 
     * @param idName
     *     The idName
     */
    public void setIdName(String idName) {
        this.idName = idName;
    }

    /**
     * 
     * @return
     *     The rarity
     */
    public String getRarity() {
        return rarity;
    }

    /**
     * 
     * @param rarity
     *     The rarity
     */
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The arena
     */
    public Integer getArena() {
        return arena;
    }

    /**
     * 
     * @param arena
     *     The arena
     */
    public void setArena(Integer arena) {
        this.arena = arena;
    }

    /**
     * 
     * @return
     *     The elixirCost
     */
    public Integer getElixirCost() {
        return elixirCost;
    }

    /**
     * 
     * @param elixirCost
     *     The elixirCost
     */
    public void setElixirCost(Integer elixirCost) {
        this.elixirCost = elixirCost;
    }

    /**
     * 
     * @return
     *     The v
     */
    public Integer getV() {
        return v;
    }

    /**
     * 
     * @param v
     *     The __v
     */
    public void setV(Integer v) {
        this.v = v;
    }

}
