// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package uk.endclothing.task.core.remote.response

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import java.lang.reflect.Type
import kotlin.Array
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class BaseResponseJsonAdapter<T>(
  moshi: Moshi,
  types: Array<Type>
) : JsonAdapter<BaseResponse<T>>() {
  init {
    require(types.size == 1) {
      buildString { append("TypeVariable mismatch: Expecting ").append(1).append(" type for generic type variables [").append("T").append("], but received ").append(types.size) }
    }
  }

  private val options: JsonReader.Options = JsonReader.Options.of("products")

  private val nullableTNullableAnyAdapter: JsonAdapter<T?> = moshi.adapter(types[0], emptySet(),
      "result")

  public override fun toString(): String = buildString(34) {
      append("GeneratedJsonAdapter(").append("BaseResponse").append(')') }

  public override fun fromJson(reader: JsonReader): BaseResponse<T> {
    var result: T? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> result = nullableTNullableAnyAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return BaseResponse<T>(
        result = result
    )
  }

  public override fun toJson(writer: JsonWriter, value_: BaseResponse<T>?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("products")
    nullableTNullableAnyAdapter.toJson(writer, value_.result)
    writer.endObject()
  }
}
