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
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

package com.google.cloud.dialogflow.v2beta1;

public final class AudioConfigProto {
  private AudioConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/dialogflow/v2beta1/audio_"
          + "config.proto\022\037google.cloud.dialogflow.v2"
          + "beta1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\036google/protob"
          + "uf/duration.proto\032\034google/api/annotation"
          + "s.proto\"/\n\rSpeechContext\022\017\n\007phrases\030\001 \003("
          + "\t\022\r\n\005boost\030\002 \001(\002\"\222\001\n\016SpeechWordInfo\022\014\n\004w"
          + "ord\030\003 \001(\t\022/\n\014start_offset\030\001 \001(\0132\031.google"
          + ".protobuf.Duration\022-\n\nend_offset\030\002 \001(\0132\031"
          + ".google.protobuf.Duration\022\022\n\nconfidence\030"
          + "\004 \001(\002\"\372\002\n\020InputAudioConfig\022F\n\016audio_enco"
          + "ding\030\001 \001(\0162..google.cloud.dialogflow.v2b"
          + "eta1.AudioEncoding\022\031\n\021sample_rate_hertz\030"
          + "\002 \001(\005\022\025\n\rlanguage_code\030\003 \001(\t\022\030\n\020enable_w"
          + "ord_info\030\r \001(\010\022\024\n\014phrase_hints\030\004 \003(\t\022G\n\017"
          + "speech_contexts\030\013 \003(\0132..google.cloud.dia"
          + "logflow.v2beta1.SpeechContext\022\r\n\005model\030\007"
          + " \001(\t\022J\n\rmodel_variant\030\n \001(\01623.google.clo"
          + "ud.dialogflow.v2beta1.SpeechModelVariant"
          + "\022\030\n\020single_utterance\030\010 \001(\010\"k\n\024VoiceSelec"
          + "tionParams\022\014\n\004name\030\001 \001(\t\022E\n\013ssml_gender\030"
          + "\002 \001(\01620.google.cloud.dialogflow.v2beta1."
          + "SsmlVoiceGender\"\270\001\n\026SynthesizeSpeechConf"
          + "ig\022\025\n\rspeaking_rate\030\001 \001(\001\022\r\n\005pitch\030\002 \001(\001"
          + "\022\026\n\016volume_gain_db\030\003 \001(\001\022\032\n\022effects_prof"
          + "ile_id\030\005 \003(\t\022D\n\005voice\030\004 \001(\01325.google.clo"
          + "ud.dialogflow.v2beta1.VoiceSelectionPara"
          + "ms\"\327\001\n\021OutputAudioConfig\022L\n\016audio_encodi"
          + "ng\030\001 \001(\01624.google.cloud.dialogflow.v2bet"
          + "a1.OutputAudioEncoding\022\031\n\021sample_rate_he"
          + "rtz\030\002 \001(\005\022Y\n\030synthesize_speech_config\030\003 "
          + "\001(\01327.google.cloud.dialogflow.v2beta1.Sy"
          + "nthesizeSpeechConfig*\373\001\n\rAudioEncoding\022\036"
          + "\n\032AUDIO_ENCODING_UNSPECIFIED\020\000\022\034\n\030AUDIO_"
          + "ENCODING_LINEAR_16\020\001\022\027\n\023AUDIO_ENCODING_F"
          + "LAC\020\002\022\030\n\024AUDIO_ENCODING_MULAW\020\003\022\026\n\022AUDIO"
          + "_ENCODING_AMR\020\004\022\031\n\025AUDIO_ENCODING_AMR_WB"
          + "\020\005\022\033\n\027AUDIO_ENCODING_OGG_OPUS\020\006\022)\n%AUDIO"
          + "_ENCODING_SPEEX_WITH_HEADER_BYTE\020\007*v\n\022Sp"
          + "eechModelVariant\022$\n SPEECH_MODEL_VARIANT"
          + "_UNSPECIFIED\020\000\022\026\n\022USE_BEST_AVAILABLE\020\001\022\020"
          + "\n\014USE_STANDARD\020\002\022\020\n\014USE_ENHANCED\020\003*\215\001\n\017S"
          + "smlVoiceGender\022!\n\035SSML_VOICE_GENDER_UNSP"
          + "ECIFIED\020\000\022\032\n\026SSML_VOICE_GENDER_MALE\020\001\022\034\n"
          + "\030SSML_VOICE_GENDER_FEMALE\020\002\022\035\n\031SSML_VOIC"
          + "E_GENDER_NEUTRAL\020\003*\244\001\n\023OutputAudioEncodi"
          + "ng\022%\n!OUTPUT_AUDIO_ENCODING_UNSPECIFIED\020"
          + "\000\022#\n\037OUTPUT_AUDIO_ENCODING_LINEAR_16\020\001\022\035"
          + "\n\031OUTPUT_AUDIO_ENCODING_MP3\020\002\022\"\n\036OUTPUT_"
          + "AUDIO_ENCODING_OGG_OPUS\020\003B\256\001\n#com.google"
          + ".cloud.dialogflow.v2beta1B\020AudioConfigPr"
          + "otoP\001ZIgoogle.golang.org/genproto/google"
          + "apis/cloud/dialogflow/v2beta1;dialogflow"
          + "\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V2bet"
          + "a1b\006proto3"
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
    internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_descriptor,
            new java.lang.String[] {
              "Phrases", "Boost",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_descriptor,
            new java.lang.String[] {
              "Word", "StartOffset", "EndOffset", "Confidence",
            });
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SampleRateHertz",
              "LanguageCode",
              "EnableWordInfo",
              "PhraseHints",
              "SpeechContexts",
              "Model",
              "ModelVariant",
              "SingleUtterance",
            });
    internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "Name", "SsmlGender",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_descriptor,
            new java.lang.String[] {
              "SpeakingRate", "Pitch", "VolumeGainDb", "EffectsProfileId", "Voice",
            });
    internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_descriptor,
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
