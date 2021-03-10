// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.healthbot.fluent.models.HealthBotInner;
import java.util.Map;

/** An immutable client-side representation of HealthBot. */
public interface HealthBot {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: SKU of the HealthBot.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the properties property: The set of properties specific to Healthbot resource.
     *
     * @return the properties value.
     */
    HealthBotProperties properties();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.healthbot.fluent.models.HealthBotInner object.
     *
     * @return the inner object.
     */
    HealthBotInner innerModel();

    /** The entirety of the HealthBot definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithSku,
            DefinitionStages.WithCreate {
    }
    /** The HealthBot definition stages. */
    interface DefinitionStages {
        /** The first stage of the HealthBot definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the HealthBot definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the HealthBot definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the Bot resource group in the user subscription.
             * @return the next definition stage.
             */
            WithSku withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the HealthBot definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU of the HealthBot..
             *
             * @param sku SKU of the HealthBot.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /**
         * The stage of the HealthBot definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            HealthBot create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            HealthBot create(Context context);
        }
        /** The stage of the HealthBot definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the HealthBot definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The set of properties specific to Healthbot resource..
             *
             * @param properties The set of properties specific to Healthbot resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(HealthBotProperties properties);
        }
    }
    /**
     * Begins update for the HealthBot resource.
     *
     * @return the stage of resource update.
     */
    HealthBot.Update update();

    /** The template for HealthBot update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithSku {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        HealthBot apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        HealthBot apply(Context context);
    }
    /** The HealthBot update stages. */
    interface UpdateStages {
        /** The stage of the HealthBot update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Tags for a HealthBot..
             *
             * @param tags Tags for a HealthBot.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the HealthBot update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU of the HealthBot..
             *
             * @param sku SKU of the HealthBot.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    HealthBot refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    HealthBot refresh(Context context);
}
