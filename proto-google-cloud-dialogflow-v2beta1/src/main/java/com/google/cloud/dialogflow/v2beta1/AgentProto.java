// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

public final class AgentProto {
  private AgentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Agent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/dialogflow/v2beta1/agent."
          + "proto\022\037google.cloud.dialogflow.v2beta1\032\034"
          + "google/api/annotations.proto\032#google/lon"
          + "grunning/operations.proto\032\033google/protob"
          + "uf/empty.proto\032 google/protobuf/field_ma"
          + "sk.proto\032\034google/protobuf/struct.proto\032\027"
          + "google/api/client.proto\"\323\005\n\005Agent\022\016\n\006par"
          + "ent\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\035\n\025defau"
          + "lt_language_code\030\003 \001(\t\022 \n\030supported_lang"
          + "uage_codes\030\004 \003(\t\022\021\n\ttime_zone\030\005 \001(\t\022\023\n\013d"
          + "escription\030\006 \001(\t\022\022\n\navatar_uri\030\007 \001(\t\022\026\n\016"
          + "enable_logging\030\010 \001(\010\022D\n\nmatch_mode\030\t \001(\016"
          + "20.google.cloud.dialogflow.v2beta1.Agent"
          + ".MatchMode\022 \n\030classification_threshold\030\n"
          + " \001(\002\022F\n\013api_version\030\016 \001(\01621.google.cloud"
          + ".dialogflow.v2beta1.Agent.ApiVersion\0229\n\004"
          + "tier\030\017 \001(\0162+.google.cloud.dialogflow.v2b"
          + "eta1.Agent.Tier\"V\n\tMatchMode\022\032\n\026MATCH_MO"
          + "DE_UNSPECIFIED\020\000\022\025\n\021MATCH_MODE_HYBRID\020\001\022"
          + "\026\n\022MATCH_MODE_ML_ONLY\020\002\"l\n\nApiVersion\022\033\n"
          + "\027API_VERSION_UNSPECIFIED\020\000\022\022\n\016API_VERSIO"
          + "N_V1\020\001\022\022\n\016API_VERSION_V2\020\002\022\031\n\025API_VERSIO"
          + "N_V2_BETA_1\020\003\"^\n\004Tier\022\024\n\020TIER_UNSPECIFIE"
          + "D\020\000\022\021\n\rTIER_STANDARD\020\001\022\023\n\017TIER_ENTERPRIS"
          + "E\020\002\022\030\n\024TIER_ENTERPRISE_PLUS\020\003\"!\n\017GetAgen"
          + "tRequest\022\016\n\006parent\030\001 \001(\t\"y\n\017SetAgentRequ"
          + "est\0225\n\005agent\030\001 \001(\0132&.google.cloud.dialog"
          + "flow.v2beta1.Agent\022/\n\013update_mask\030\002 \001(\0132"
          + "\032.google.protobuf.FieldMask\"$\n\022DeleteAge"
          + "ntRequest\022\016\n\006parent\030\001 \001(\t\"L\n\023SearchAgent"
          + "sRequest\022\016\n\006parent\030\001 \001(\t\022\021\n\tpage_size\030\002 "
          + "\001(\005\022\022\n\npage_token\030\003 \001(\t\"g\n\024SearchAgentsR"
          + "esponse\0226\n\006agents\030\001 \003(\0132&.google.cloud.d"
          + "ialogflow.v2beta1.Agent\022\027\n\017next_page_tok"
          + "en\030\002 \001(\t\"#\n\021TrainAgentRequest\022\016\n\006parent\030"
          + "\001 \001(\t\"7\n\022ExportAgentRequest\022\016\n\006parent\030\001 "
          + "\001(\t\022\021\n\tagent_uri\030\002 \001(\t\"L\n\023ExportAgentRes"
          + "ponse\022\023\n\tagent_uri\030\001 \001(\tH\000\022\027\n\ragent_cont"
          + "ent\030\002 \001(\014H\000B\007\n\005agent\"[\n\022ImportAgentReque"
          + "st\022\016\n\006parent\030\001 \001(\t\022\023\n\tagent_uri\030\002 \001(\tH\000\022"
          + "\027\n\ragent_content\030\003 \001(\014H\000B\007\n\005agent\"\\\n\023Res"
          + "toreAgentRequest\022\016\n\006parent\030\001 \001(\t\022\023\n\tagen"
          + "t_uri\030\002 \001(\tH\000\022\027\n\ragent_content\030\003 \001(\014H\000B\007"
          + "\n\005agent2\327\n\n\006Agents\022\220\001\n\010GetAgent\0220.google"
          + ".cloud.dialogflow.v2beta1.GetAgentReques"
          + "t\032&.google.cloud.dialogflow.v2beta1.Agen"
          + "t\"*\202\323\344\223\002$\022\"/v2beta1/{parent=projects/*}/"
          + "agent\022\235\001\n\010SetAgent\0220.google.cloud.dialog"
          + "flow.v2beta1.SetAgentRequest\032&.google.cl"
          + "oud.dialogflow.v2beta1.Agent\"7\202\323\344\223\0021\"(/v"
          + "2beta1/{agent.parent=projects/*}/agent:\005"
          + "agent\022\206\001\n\013DeleteAgent\0223.google.cloud.dia"
          + "logflow.v2beta1.DeleteAgentRequest\032\026.goo"
          + "gle.protobuf.Empty\"*\202\323\344\223\002$*\"/v2beta1/{pa"
          + "rent=projects/*}/agent\022\256\001\n\014SearchAgents\022"
          + "4.google.cloud.dialogflow.v2beta1.Search"
          + "AgentsRequest\0325.google.cloud.dialogflow."
          + "v2beta1.SearchAgentsResponse\"1\202\323\344\223\002+\022)/v"
          + "2beta1/{parent=projects/*}/agent:search\022"
          + "\224\001\n\nTrainAgent\0222.google.cloud.dialogflow"
          + ".v2beta1.TrainAgentRequest\032\035.google.long"
          + "running.Operation\"3\202\323\344\223\002-\"(/v2beta1/{par"
          + "ent=projects/*}/agent:train:\001*\022\227\001\n\013Expor"
          + "tAgent\0223.google.cloud.dialogflow.v2beta1"
          + ".ExportAgentRequest\032\035.google.longrunning"
          + ".Operation\"4\202\323\344\223\002.\")/v2beta1/{parent=pro"
          + "jects/*}/agent:export:\001*\022\227\001\n\013ImportAgent"
          + "\0223.google.cloud.dialogflow.v2beta1.Impor"
          + "tAgentRequest\032\035.google.longrunning.Opera"
          + "tion\"4\202\323\344\223\002.\")/v2beta1/{parent=projects/"
          + "*}/agent:import:\001*\022\232\001\n\014RestoreAgent\0224.go"
          + "ogle.cloud.dialogflow.v2beta1.RestoreAge"
          + "ntRequest\032\035.google.longrunning.Operation"
          + "\"5\202\323\344\223\002/\"*/v2beta1/{parent=projects/*}/a"
          + "gent:restore:\001*\032x\312A\031dialogflow.googleapi"
          + "s.com\322AYhttps://www.googleapis.com/auth/"
          + "cloud-platform,https://www.googleapis.co"
          + "m/auth/dialogflowB\250\001\n#com.google.cloud.d"
          + "ialogflow.v2beta1B\nAgentProtoP\001ZIgoogle."
          + "golang.org/genproto/googleapis/cloud/dia"
          + "logflow/v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Goo"
          + "gle.Cloud.Dialogflow.V2beta1b\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2beta1_Agent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Agent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Agent_descriptor,
            new java.lang.String[] {
              "Parent",
              "DisplayName",
              "DefaultLanguageCode",
              "SupportedLanguageCodes",
              "TimeZone",
              "Description",
              "AvatarUri",
              "EnableLogging",
              "MatchMode",
              "ClassificationThreshold",
              "ApiVersion",
              "Tier",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_descriptor,
            new java.lang.String[] {
              "Agent", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor,
            new java.lang.String[] {
              "Agents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor,
            new java.lang.String[] {
              "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri", "AgentContent", "Agent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
