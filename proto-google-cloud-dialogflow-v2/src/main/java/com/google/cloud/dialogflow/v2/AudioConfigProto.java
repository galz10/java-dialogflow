/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

public final class AudioConfigProto {
  private AudioConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2/audio_confi"
          + "g.proto\022\032google.cloud.dialogflow.v2\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\032\036google/protobuf/duratio"
          + "n.proto\032\034google/api/annotations.proto\"\376\001"
          + "\n\020InputAudioConfig\022A\n\016audio_encoding\030\001 \001"
          + "(\0162).google.cloud.dialogflow.v2.AudioEnc"
          + "oding\022\031\n\021sample_rate_hertz\030\002 \001(\005\022\025\n\rlang"
          + "uage_code\030\003 \001(\t\022\024\n\014phrase_hints\030\004 \003(\t\022E\n"
          + "\rmodel_variant\030\n \001(\0162..google.cloud.dial"
          + "ogflow.v2.SpeechModelVariant\022\030\n\020single_u"
          + "tterance\030\010 \001(\010\"f\n\024VoiceSelectionParams\022\014"
          + "\n\004name\030\001 \001(\t\022@\n\013ssml_gender\030\002 \001(\0162+.goog"
          + "le.cloud.dialogflow.v2.SsmlVoiceGender\"\263"
          + "\001\n\026SynthesizeSpeechConfig\022\025\n\rspeaking_ra"
          + "te\030\001 \001(\001\022\r\n\005pitch\030\002 \001(\001\022\026\n\016volume_gain_d"
          + "b\030\003 \001(\001\022\032\n\022effects_profile_id\030\005 \003(\t\022?\n\005v"
          + "oice\030\004 \001(\01320.google.cloud.dialogflow.v2."
          + "VoiceSelectionParams\"\315\001\n\021OutputAudioConf"
          + "ig\022G\n\016audio_encoding\030\001 \001(\0162/.google.clou"
          + "d.dialogflow.v2.OutputAudioEncoding\022\031\n\021s"
          + "ample_rate_hertz\030\002 \001(\005\022T\n\030synthesize_spe"
          + "ech_config\030\003 \001(\01322.google.cloud.dialogfl"
          + "ow.v2.SynthesizeSpeechConfig*\373\001\n\rAudioEn"
          + "coding\022\036\n\032AUDIO_ENCODING_UNSPECIFIED\020\000\022\034"
          + "\n\030AUDIO_ENCODING_LINEAR_16\020\001\022\027\n\023AUDIO_EN"
          + "CODING_FLAC\020\002\022\030\n\024AUDIO_ENCODING_MULAW\020\003\022"
          + "\026\n\022AUDIO_ENCODING_AMR\020\004\022\031\n\025AUDIO_ENCODIN"
          + "G_AMR_WB\020\005\022\033\n\027AUDIO_ENCODING_OGG_OPUS\020\006\022"
          + ")\n%AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE"
          + "\020\007*v\n\022SpeechModelVariant\022$\n SPEECH_MODEL"
          + "_VARIANT_UNSPECIFIED\020\000\022\026\n\022USE_BEST_AVAIL"
          + "ABLE\020\001\022\020\n\014USE_STANDARD\020\002\022\020\n\014USE_ENHANCED"
          + "\020\003*\215\001\n\017SsmlVoiceGender\022!\n\035SSML_VOICE_GEN"
          + "DER_UNSPECIFIED\020\000\022\032\n\026SSML_VOICE_GENDER_M"
          + "ALE\020\001\022\034\n\030SSML_VOICE_GENDER_FEMALE\020\002\022\035\n\031S"
          + "SML_VOICE_GENDER_NEUTRAL\020\003*\244\001\n\023OutputAud"
          + "ioEncoding\022%\n!OUTPUT_AUDIO_ENCODING_UNSP"
          + "ECIFIED\020\000\022#\n\037OUTPUT_AUDIO_ENCODING_LINEA"
          + "R_16\020\001\022\035\n\031OUTPUT_AUDIO_ENCODING_MP3\020\002\022\"\n"
          + "\036OUTPUT_AUDIO_ENCODING_OGG_OPUS\020\003B\237\001\n\036co"
          + "m.google.cloud.dialogflow.v2B\020AudioConfi"
          + "gProtoP\001ZDgoogle.golang.org/genproto/goo"
          + "gleapis/cloud/dialogflow/v2;dialogflow\370\001"
          + "\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V2b\006pro"
          + "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_InputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SampleRateHertz",
              "LanguageCode",
              "PhraseHints",
              "ModelVariant",
              "SingleUtterance",
            });
    internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "Name", "SsmlGender",
            });
    internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_descriptor,
            new java.lang.String[] {
              "SpeakingRate", "Pitch", "VolumeGainDb", "EffectsProfileId", "Voice",
            });
    internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding", "SampleRateHertz", "SynthesizeSpeechConfig",
            });
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
