// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.input_object_type.type

import com.apollographql.apollo.api.Input
import com.apollographql.apollo.api.InputFieldMarshaller
import com.apollographql.apollo.api.InputType
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

/**
 * The input object sent when passing in a color
 */
@Suppress("NAME_SHADOWING", "LocalVariableName", "RemoveExplicitTypeArguments")
class ColorInput(
    /**
     * Red color
     */
    val red: Int,
    /**
     * Green color
     */
    val green: Input<Double> = Input.optional(0.0),
    /**
     * Blue color
     */
    val blue: Double,
    /**
     * for test purpose only
     */
    val enumWithDefaultValue: Input<Episode> = Input.optional(Episode.safeValueOf("new"))
) : InputType {
    override fun marshaller(): InputFieldMarshaller = InputFieldMarshaller { writer ->
        writer.writeInt("red", red)
        if (green.defined) writer.writeDouble("green", green.value)
        writer.writeDouble("blue", blue)
        if (enumWithDefaultValue.defined) writer.writeString("enumWithDefaultValue",
                enumWithDefaultValue.value?.rawValue)
    }
}
