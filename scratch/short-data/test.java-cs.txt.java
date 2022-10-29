public void serialize(LittleEndianOutput out) {out.writeShort(field_1_vcenter);}
public void addAll(BlockList<T> src) {if (src.size == 0)return;int srcDirIdx = 0;for (; srcDirIdx < src.tailDirIdx; srcDirIdx++)addAll(src.directory[srcDirIdx], 0, BLOCK_SIZE);if (src.tailBlkIdx != 0)addAll(src.tailBlock, 0, src.tailBlkIdx);}
public void writeByte(byte b) {if (upto == blockSize) {if (currentBlock != null) {addBlock(currentBlock);}currentBlock = new byte[blockSize];upto = 0;}currentBlock[upto++] = b;}
public ObjectId getObjectId() {return objectId;}
public DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest request) {request = beforeClientExecution(request);return executeDeleteDomainEntry(request);}
public long ramBytesUsed() {return ((termOffsets!=null)? termOffsets.ramBytesUsed() : 0) +((termsDictOffsets!=null)? termsDictOffsets.ramBytesUsed() : 0);}
public final String getFullMessage() {byte[] raw = buffer;int msgB = RawParseUtils.tagMessage(raw, 0);if (msgB < 0) {return ""; }return RawParseUtils.decode(guessEncoding(), raw, msgB, raw.length);}
public POIFSFileSystem() {this(true);_header.setBATCount(1);_header.setBATArray(new int[]{1});BATBlock bb = BATBlock.createEmptyBATBlock(bigBlockSize, false);bb.setOurBlockIndex(1);_bat_blocks.add(bb);setNextBlock(0, POIFSConstants.END_OF_CHAIN);setNextBlock(1, POIFSConstants.FAT_SECTOR_BLOCK);_property_table.setStartBlock(0);}
public void init(int address) {slice = pool.buffers[address >> ByteBlockPool.BYTE_BLOCK_SHIFT];assert slice != null;upto = address & ByteBlockPool.BYTE_BLOCK_MASK;offset0 = address;assert upto < slice.length;}
public SubmoduleAddCommand setPath(String path) {this.path = path;return this;}
public ListIngestionsResult listIngestions(ListIngestionsRequest request) {request = beforeClientExecution(request);return executeListIngestions(request);}
public QueryParserTokenManager(CharStream stream, int lexState){this(stream);SwitchTo(lexState);}
public GetShardIteratorResult getShardIterator(GetShardIteratorRequest request) {request = beforeClientExecution(request);return executeGetShardIterator(request);}
public ModifyStrategyRequest() {super("aegis", "2016-11-11", "ModifyStrategy", "vipaegis");setMethod(MethodType.POST);}
public boolean ready() throws IOException {synchronized (lock) {if (in == null) {throw new IOException("InputStreamReader is closed");}try {return bytes.hasRemaining() || in.available() > 0;} catch (IOException e) {return false;}}}
public EscherOptRecord getOptRecord() {return _optRecord;}
public synchronized int read(byte[] buffer, int offset, int length) {if (buffer == null) {throw new NullPointerException("buffer == null");}Arrays.checkOffsetAndCount(buffer.length, offset, length);if (length == 0) {return 0;}int copylen = count - pos < length ? count - pos : length;for (int i = 0; i < copylen; i++) {buffer[offset + i] = (byte) this.buffer.charAt(pos + i);}pos += copylen;return copylen;}
public OpenNLPSentenceBreakIterator(NLPSentenceDetectorOp sentenceOp) {this.sentenceOp = sentenceOp;}
public void print(String str) {write(str != null ? str : String.valueOf((Object) null));}
public NotImplementedFunctionException(String functionName, NotImplementedException cause) {super(functionName, cause);this.functionName = functionName;}
public V next() {return super.nextEntry().getValue();}
public final void readBytes(byte[] b, int offset, int len, boolean useBuffer) throws IOException {int available = bufferLength - bufferPosition;if(len <= available){if(len>0) System.arraycopy(buffer, bufferPosition, b, offset, len);bufferPosition+=len;} else {if(available > 0){System.arraycopy(buffer, bufferPosition, b, offset, available);offset += available;len -= available;bufferPosition += available;}if (useBuffer && len<bufferSize){refill();if(bufferLength<len){System.arraycopy(buffer, 0, b, offset, bufferLength);throw new EOFException("read past EOF: " + this);} else {System.arraycopy(buffer, 0, b, offset, len);bufferPosition=len;}} else {long after = bufferStart+bufferPosition+len;if(after > length())throw new EOFException("read past EOF: " + this);readInternal(b, offset, len);bufferStart = after;bufferPosition = 0;bufferLength = 0;                    }}}
public TagQueueResult tagQueue(TagQueueRequest request) {request = beforeClientExecution(request);return executeTagQueue(request);}
public void remove() {throw new UnsupportedOperationException();}
public CacheSubnetGroup modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest request) {request = beforeClientExecution(request);return executeModifyCacheSubnetGroup(request);}
public void setParams(String params) {super.setParams(params);language = country = variant = "";StringTokenizer st = new StringTokenizer(params, ",");if (st.hasMoreTokens())language = st.nextToken();if (st.hasMoreTokens())country = st.nextToken();if (st.hasMoreTokens())variant = st.nextToken();}
public DeleteDocumentationVersionResult deleteDocumentationVersion(DeleteDocumentationVersionRequest request) {request = beforeClientExecution(request);return executeDeleteDocumentationVersion(request);}
public boolean equals(Object obj) {if (!(obj instanceof FacetLabel)) {return false;}FacetLabel other = (FacetLabel) obj;if (length != other.length) {return false; }for (int i = length - 1; i >= 0; i--) {if (!components[i].equals(other.components[i])) {return false;}}return true;}
public GetInstanceAccessDetailsResult getInstanceAccessDetails(GetInstanceAccessDetailsRequest request) {request = beforeClientExecution(request);return executeGetInstanceAccessDetails(request);}
public HSSFPolygon createPolygon(HSSFChildAnchor anchor) {HSSFPolygon shape = new HSSFPolygon(this, anchor);shape.setParent(this);shape.setAnchor(anchor);shapes.add(shape);onCreate(shape);return shape;}
public String getSheetName(int sheetIndex) {return getBoundSheetRec(sheetIndex).getSheetname();}
public GetDashboardResult getDashboard(GetDashboardRequest request) {request = beforeClientExecution(request);return executeGetDashboard(request);}
public AssociateSigninDelegateGroupsWithAccountResult associateSigninDelegateGroupsWithAccount(AssociateSigninDelegateGroupsWithAccountRequest request) {request = beforeClientExecution(request);return executeAssociateSigninDelegateGroupsWithAccount(request);}
public void addMultipleBlanks(MulBlankRecord mbr) {for (int j = 0; j < mbr.getNumColumns(); j++) {BlankRecord br = new BlankRecord();br.setColumn(( short ) (j + mbr.getFirstColumn()));br.setRow(mbr.getRow());br.setXFIndex(mbr.getXFAt(j));insertCell(br);}}
public static String quote(String string) {StringBuilder sb = new StringBuilder();sb.append("\\Q");int apos = 0;int k;while ((k = string.indexOf("\\E", apos)) >= 0) {sb.append(string.substring(apos, k + 2)).append("\\\\E\\Q");apos = k + 2;}return sb.append(string.substring(apos)).append("\\E").toString();}
public ByteBuffer putInt(int value) {throw new ReadOnlyBufferException();}
public ArrayPtg(Object[][] values2d) {int nColumns = values2d[0].length;int nRows = values2d.length;_nColumns = (short) nColumns;_nRows = (short) nRows;Object[] vv = new Object[_nColumns * _nRows];for (int r=0; r<nRows; r++) {Object[] rowData = values2d[r];for (int c=0; c<nColumns; c++) {vv[getValueIndex(c, r)] = rowData[c];}}_arrayValues = vv;_reserved0Int = 0;_reserved1Short = 0;_reserved2Byte = 0;}
public GetIceServerConfigResult getIceServerConfig(GetIceServerConfigRequest request) {request = beforeClientExecution(request);return executeGetIceServerConfig(request);}
public String toString() {return getClass().getName() + " [" +getValueAsString() +"]";}
public String toString(String field) {return "ToChildBlockJoinQuery ("+parentQuery.toString()+")";}
public final void incRef() {refCount.incrementAndGet();}
public UpdateConfigurationSetSendingEnabledResult updateConfigurationSetSendingEnabled(UpdateConfigurationSetSendingEnabledRequest request) {request = beforeClientExecution(request);return executeUpdateConfigurationSetSendingEnabled(request);}
public int getNextXBATChainOffset() {return getXBATEntriesPerBlock() * LittleEndianConsts.INT_SIZE;}
public void multiplyByPowerOfTen(int pow10) {TenPower tp = TenPower.getInstance(Math.abs(pow10));if (pow10 < 0) {mulShift(tp._divisor, tp._divisorShift);} else {mulShift(tp._multiplicand, tp._multiplierShift);}}
public String toString(){final StringBuilder b = new StringBuilder();final int          l = length();b.append(File.separatorChar);for (int i = 0; i < l; i++){b.append(getComponent(i));if (i < l - 1){b.append(File.separatorChar);}}return b.toString();}
public InstanceProfileCredentialsProvider withFetcher(ECSMetadataServiceCredentialsFetcher fetcher) {this.fetcher = fetcher;this.fetcher.setRoleName(roleName);return this;}
public void setProgressMonitor(ProgressMonitor pm) {progressMonitor = pm;}
public void reset() {if (!first()) {ptr = 0;if (!eof())parseEntry();}}
public E previous() {if (iterator.previousIndex() >= start) {return iterator.previous();}throw new NoSuchElementException();}
public String getNewPrefix() {return this.newPrefix;}
public int indexOfValue(int value) {for (int i = 0; i < mSize; i++)if (mValues[i] == value)return i;return -1;}
public List<CharsRef> uniqueStems(char word[], int length) {List<CharsRef> stems = stem(word, length);if (stems.size() < 2) {return stems;}CharArraySet terms = new CharArraySet(8, dictionary.ignoreCase);List<CharsRef> deduped = new ArrayList<>();for (CharsRef s : stems) {if (!terms.contains(s)) {deduped.add(s);terms.add(s);}}return deduped;}
public GetGatewayResponsesResult getGatewayResponses(GetGatewayResponsesRequest request) {request = beforeClientExecution(request);return executeGetGatewayResponses(request);}
public void setPosition(long pos) {currentBlockIndex = (int) (pos >> blockBits);currentBlock = blocks[currentBlockIndex];currentBlockUpto = (int) (pos & blockMask);}
public long skip(long n) {int s = (int) Math.min(available(), Math.max(0, n));ptr += s;return s;}
public BootstrapActionDetail(BootstrapActionConfig bootstrapActionConfig) {setBootstrapActionConfig(bootstrapActionConfig);}
public void serialize(LittleEndianOutput out) {out.writeShort(field_1_row);out.writeShort(field_2_col);out.writeShort(field_3_flags);out.writeShort(field_4_shapeid);out.writeShort(field_6_author.length());out.writeByte(field_5_hasMultibyte ? 0x01 : 0x00);if (field_5_hasMultibyte) {StringUtil.putUnicodeLE(field_6_author, out);} else {StringUtil.putCompressedUnicode(field_6_author, out);}if (field_7_padding != null) {out.writeByte(field_7_padding.intValue());}}
public int lastIndexOf(String string) {return lastIndexOf(string, count);}
public boolean add(E object) {return addLastImpl(object);}
public void unsetSection(String section, String subsection) {ConfigSnapshot src, res;do {src = state.get();res = unsetSection(src, section, subsection);} while (!state.compareAndSet(src, res));}
public final String getTagName() {return tagName;}
public void addSubRecord(int index, SubRecord element) {subrecords.add(index, element);}
public boolean remove(Object o) {synchronized (mutex) {return delegate().remove(o);}}
public DoubleMetaphoneFilter create(TokenStream input) {return new DoubleMetaphoneFilter(input, maxCodeLength, inject);}
public long length() {return inCoreLength();}
public void setValue(boolean newValue) {value = newValue;}
public Pair(ContentSource oldSource, ContentSource newSource) {this.oldSource = oldSource;this.newSource = newSource;}
public int get(int i) {if (count <= i)throw new ArrayIndexOutOfBoundsException(i);return entries[i];}
public CreateRepoRequest() {super("cr", "2016-06-07", "CreateRepo", "cr");setUriPattern("/repos");setMethod(MethodType.PUT);}
public boolean isDeltaBaseAsOffset() {return deltaBaseAsOffset;}
public void remove() {if (expectedModCount == list.modCount) {if (lastLink != null) {Link<ET> next = lastLink.next;Link<ET> previous = lastLink.previous;next.previous = previous;previous.next = next;if (lastLink == link) {pos--;}link = previous;lastLink = null;expectedModCount++;list.size--;list.modCount++;} else {throw new IllegalStateException();}} else {throw new ConcurrentModificationException();}}
public MergeShardsResult mergeShards(MergeShardsRequest request) {request = beforeClientExecution(request);return executeMergeShards(request);}
public AllocateHostedConnectionResult allocateHostedConnection(AllocateHostedConnectionRequest request) {request = beforeClientExecution(request);return executeAllocateHostedConnection(request);}
public int getBeginIndex() {return start;}
public static final WeightedTerm[] getTerms(Query query){return getTerms(query,false);}
public ByteBuffer compact() {throw new ReadOnlyBufferException();}
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long byte0 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = byte0 >>> 2;final long byte1 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte0 & 3) << 4) | (byte1 >>> 4);final long byte2 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte1 & 15) << 2) | (byte2 >>> 6);values[valuesOffset++] = byte2 & 63;}}
public String getHumanishName() throws IllegalArgumentException {String s = getPath();if ("/".equals(s) || "".equals(s)) s = getHost();if (s == null) throw new IllegalArgumentException();String[] elements;if ("file".equals(scheme) || LOCAL_FILE.matcher(s).matches()) elements = s.split("[\\" + File.separatorChar + "/]"); elseelements = s.split("/+"); if (elements.length == 0)throw new IllegalArgumentException();String result = elements[elements.length - 1];if (Constants.DOT_GIT.equals(result))result = elements[elements.length - 2];else if (result.endsWith(Constants.DOT_GIT_EXT))result = result.substring(0, result.length()- Constants.DOT_GIT_EXT.length());return result;}
public DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfig(DescribeNotebookInstanceLifecycleConfigRequest request) {request = beforeClientExecution(request);return executeDescribeNotebookInstanceLifecycleConfig(request);}
public String getAccessKeySecret() {return this.accessKeySecret;}
public CreateVpnConnectionResult createVpnConnection(CreateVpnConnectionRequest request) {request = beforeClientExecution(request);return executeCreateVpnConnection(request);}
public DescribeVoicesResult describeVoices(DescribeVoicesRequest request) {request = beforeClientExecution(request);return executeDescribeVoices(request);}
public ListMonitoringExecutionsResult listMonitoringExecutions(ListMonitoringExecutionsRequest request) {request = beforeClientExecution(request);return executeListMonitoringExecutions(request);}
public DescribeJobRequest(String vaultName, String jobId) {setVaultName(vaultName);setJobId(jobId);}
public EscherRecord getEscherRecord(int index){return escherRecords.get(index);}
public GetApisResult getApis(GetApisRequest request) {request = beforeClientExecution(request);return executeGetApis(request);}
public DeleteSmsChannelResult deleteSmsChannel(DeleteSmsChannelRequest request) {request = beforeClientExecution(request);return executeDeleteSmsChannel(request);}
public TrackingRefUpdate getTrackingRefUpdate() {return trackingRefUpdate;}
public void print(boolean b) {print(String.valueOf(b));}
public QueryNode getChild() {return getChildren().get(0);}
public NotIgnoredFilter(int workdirTreeIndex) {this.index = workdirTreeIndex;}
public AreaRecord(RecordInputStream in) {field_1_formatFlags            = in.readShort();}
public GetThumbnailRequest() {super("CloudPhoto", "2017-07-11", "GetThumbnail", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public DescribeTransitGatewayVpcAttachmentsResult describeTransitGatewayVpcAttachments(DescribeTransitGatewayVpcAttachmentsRequest request) {request = beforeClientExecution(request);return executeDescribeTransitGatewayVpcAttachments(request);}
public PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(PutVoiceConnectorStreamingConfigurationRequest request) {request = beforeClientExecution(request);return executePutVoiceConnectorStreamingConfiguration(request);}
public OrdRange getOrdRange(String dim) {return prefixToOrdRange.get(dim);}
public String toString() {String symbol = "";if (startIndex >= 0 && startIndex < getInputStream().size()) {symbol = getInputStream().getText(Interval.of(startIndex,startIndex));symbol = Utils.escapeWhitespace(symbol, false);}return String.format(Locale.getDefault(), "%s('%s')", LexerNoViableAltException.class.getSimpleName(), symbol);}
public E peek() {return peekFirstImpl();}
public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest request) {request = beforeClientExecution(request);return executeCreateWorkspaces(request);}
public NumberFormatIndexRecord clone() {return copy();}
public DescribeRepositoriesResult describeRepositories(DescribeRepositoriesRequest request) {request = beforeClientExecution(request);return executeDescribeRepositories(request);}
public SparseIntArray(int initialCapacity) {initialCapacity = ArrayUtils.idealIntArraySize(initialCapacity);mKeys = new int[initialCapacity];mValues = new int[initialCapacity];mSize = 0;}
public HyphenatedWordsFilter create(TokenStream input) {return new HyphenatedWordsFilter(input);}
public CreateDistributionWithTagsResult createDistributionWithTags(CreateDistributionWithTagsRequest request) {request = beforeClientExecution(request);return executeCreateDistributionWithTags(request);}
public RandomAccessFile(String fileName, String mode) throws FileNotFoundException {this(new File(fileName), mode);}
public DeleteWorkspaceImageResult deleteWorkspaceImage(DeleteWorkspaceImageRequest request) {request = beforeClientExecution(request);return executeDeleteWorkspaceImage(request);}
public static String toHex(long value) {StringBuilder sb = new StringBuilder(16);writeHex(sb, value, 16, "");return sb.toString();}
public UpdateDistributionResult updateDistribution(UpdateDistributionRequest request) {request = beforeClientExecution(request);return executeUpdateDistribution(request);}
public HSSFColor getColor(short index){if (index == HSSFColorPredefined.AUTOMATIC.getIndex()) {return HSSFColorPredefined.AUTOMATIC.getColor();}byte[] b = _palette.getColor(index);return (b == null) ? null : new CustomColor(index, b);}
public ValueEval evaluate(ValueEval[] operands, int srcRow, int srcCol) {throw new NotImplementedFunctionException(_functionName);}
public void serialize(LittleEndianOutput out) {out.writeShort((short)field_1_number_crn_records);out.writeShort((short)field_2_sheet_table_index);}
public DescribeDBEngineVersionsResult describeDBEngineVersions() {return describeDBEngineVersions(new DescribeDBEngineVersionsRequest());}
public FormatRun(short character, short fontIndex) {this._character = character;this._fontIndex = fontIndex;}
public static byte[] toBigEndianUtf16Bytes(char[] chars, int offset, int length) {byte[] result = new byte[length * 2];int end = offset + length;int resultIndex = 0;for (int i = offset; i < end; ++i) {char ch = chars[i];result[resultIndex++] = (byte) (ch >> 8);result[resultIndex++] = (byte) ch;}return result;}
public UploadArchiveResult uploadArchive(UploadArchiveRequest request) {request = beforeClientExecution(request);return executeUploadArchive(request);}
public List<Token> getHiddenTokensToLeft(int tokenIndex) {return getHiddenTokensToLeft(tokenIndex, -1);}
public boolean equals(Object obj) {if (this == obj)return true;if (!super.equals(obj))return false;if (getClass() != obj.getClass())return false;AutomatonQuery other = (AutomatonQuery) obj;if (!compiled.equals(other.compiled))return false;if (term == null) {if (other.term != null)return false;} else if (!term.equals(other.term))return false;return true;}
public SpanQuery makeSpanClause() {SpanQuery [] spanQueries = new SpanQuery[size()];Iterator<SpanQuery> sqi = weightBySpanQuery.keySet().iterator();int i = 0;while (sqi.hasNext()) {SpanQuery sq = sqi.next();float boost = weightBySpanQuery.get(sq);if (boost != 1f) {sq = new SpanBoostQuery(sq, boost);}spanQueries[i++] = sq;}if (spanQueries.length == 1)return spanQueries[0];else return new SpanOrQuery(spanQueries);}
public StashCreateCommand stashCreate() {return new StashCreateCommand(repo);}
public FieldInfo fieldInfo(String fieldName) {return byName.get(fieldName);}
public DescribeEventSourceResult describeEventSource(DescribeEventSourceRequest request) {request = beforeClientExecution(request);return executeDescribeEventSource(request);}
public GetDocumentAnalysisResult getDocumentAnalysis(GetDocumentAnalysisRequest request) {request = beforeClientExecution(request);return executeGetDocumentAnalysis(request);}
public CancelUpdateStackResult cancelUpdateStack(CancelUpdateStackRequest request) {request = beforeClientExecution(request);return executeCancelUpdateStack(request);}
public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest request) {request = beforeClientExecution(request);return executeModifyLoadBalancerAttributes(request);}
public SetInstanceProtectionResult setInstanceProtection(SetInstanceProtectionRequest request) {request = beforeClientExecution(request);return executeSetInstanceProtection(request);}
public ModifyDBProxyResult modifyDBProxy(ModifyDBProxyRequest request) {request = beforeClientExecution(request);return executeModifyDBProxy(request);}
public void add(char[] output, int offset, int len, int endOffset, int posLength) {if (count == outputs.length) {outputs = ArrayUtil.grow(outputs, count+1);}if (count == endOffsets.length) {final int[] next = new int[ArrayUtil.oversize(1+count, Integer.BYTES)];System.arraycopy(endOffsets, 0, next, 0, count);endOffsets = next;}if (count == posLengths.length) {final int[] next = new int[ArrayUtil.oversize(1+count, Integer.BYTES)];System.arraycopy(posLengths, 0, next, 0, count);posLengths = next;}if (outputs[count] == null) {outputs[count] = new CharsRefBuilder();}outputs[count].copyChars(output, offset, len);endOffsets[count] = endOffset;posLengths[count] = posLength;count++;}
public FetchLibrariesRequest() {super("CloudPhoto", "2017-07-11", "FetchLibraries", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public boolean exists() {return fs.exists(objects);}
public FilterOutputStream(OutputStream out) {this.out = out;}
public ScaleClusterRequest() {super("CS", "2015-12-15", "ScaleCluster", "csk");setUriPattern("/clusters/[ClusterId]");setMethod(MethodType.PUT);}
public DataValidationConstraint createTimeConstraint(int operatorType, String formula1, String formula2) {return DVConstraint.createTimeConstraint(operatorType, formula1, formula2);}
public ListObjectParentPathsResult listObjectParentPaths(ListObjectParentPathsRequest request) {request = beforeClientExecution(request);return executeListObjectParentPaths(request);}
public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest request) {request = beforeClientExecution(request);return executeDescribeCacheSubnetGroups(request);}
public void setSharedFormula(boolean flag) {field_5_options =sharedFormula.setShortBoolean(field_5_options, flag);}
public boolean isReuseObjects() {return reuseObjects;}
public ErrorNode addErrorNode(Token badToken) {ErrorNodeImpl t = new ErrorNodeImpl(badToken);addAnyChild(t);t.setParent(this);return t;}
public LatvianStemFilterFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public EventSubscription removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest request) {request = beforeClientExecution(request);return executeRemoveSourceIdentifierFromSubscription(request);}
public static TokenFilterFactory forName(String name, Map<String,String> args) {return loader.newInstance(name, args);}
public AddAlbumPhotosRequest() {super("CloudPhoto", "2017-07-11", "AddAlbumPhotos", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public GetThreatIntelSetResult getThreatIntelSet(GetThreatIntelSetRequest request) {request = beforeClientExecution(request);return executeGetThreatIntelSet(request);}
public RevFilter clone() {return new Binary(a.clone(), b.clone());}
public boolean equals( Object o ) {return o instanceof ArmenianStemmer;}
public final boolean hasArray() {return protectedHasArray();}
public UpdateContributorInsightsResult updateContributorInsights(UpdateContributorInsightsRequest request) {request = beforeClientExecution(request);return executeUpdateContributorInsights(request);}
public void unwriteProtectWorkbook() {records.remove(fileShare);records.remove(writeProtect);fileShare = null;writeProtect = null;}
public SolrSynonymParser(boolean dedup, boolean expand, Analyzer analyzer) {super(dedup, analyzer);this.expand = expand;}
public RequestSpotInstancesResult requestSpotInstances(RequestSpotInstancesRequest request) {request = beforeClientExecution(request);return executeRequestSpotInstances(request);}
public byte[] getObjectData() {return findObjectRecord().getObjectData();}
public GetContactAttributesResult getContactAttributes(GetContactAttributesRequest request) {request = beforeClientExecution(request);return executeGetContactAttributes(request);}
public String toString() {return getKey() + ": " + getValue(); }
public ListTextTranslationJobsResult listTextTranslationJobs(ListTextTranslationJobsRequest request) {request = beforeClientExecution(request);return executeListTextTranslationJobs(request);}
public GetContactMethodsResult getContactMethods(GetContactMethodsRequest request) {request = beforeClientExecution(request);return executeGetContactMethods(request);}
public static short lookupIndexByName(String name) {FunctionMetadata fd = getInstance().getFunctionByNameInternal(name);if (fd == null) {fd = getInstanceCetab().getFunctionByNameInternal(name);if (fd == null) {return -1;}}return (short) fd.getIndex();}
public DescribeAnomalyDetectorsResult describeAnomalyDetectors(DescribeAnomalyDetectorsRequest request) {request = beforeClientExecution(request);return executeDescribeAnomalyDetectors(request);}
public static String insertId(String message, ObjectId changeId) {return insertId(message, changeId, false);}
public long getObjectSize(AnyObjectId objectId, int typeHint)throws MissingObjectException, IncorrectObjectTypeException,IOException {long sz = db.getObjectSize(this, objectId);if (sz < 0) {if (typeHint == OBJ_ANY)throw new MissingObjectException(objectId.copy(),JGitText.get().unknownObjectType2);throw new MissingObjectException(objectId.copy(), typeHint);}return sz;}
public ImportInstallationMediaResult importInstallationMedia(ImportInstallationMediaRequest request) {request = beforeClientExecution(request);return executeImportInstallationMedia(request);}
public PutLifecycleEventHookExecutionStatusResult putLifecycleEventHookExecutionStatus(PutLifecycleEventHookExecutionStatusRequest request) {request = beforeClientExecution(request);return executePutLifecycleEventHookExecutionStatus(request);}
public NumberPtg(LittleEndianInput in)  {this(in.readDouble());}
public GetFieldLevelEncryptionConfigResult getFieldLevelEncryptionConfig(GetFieldLevelEncryptionConfigRequest request) {request = beforeClientExecution(request);return executeGetFieldLevelEncryptionConfig(request);}
public DescribeDetectorResult describeDetector(DescribeDetectorRequest request) {request = beforeClientExecution(request);return executeDescribeDetector(request);}
public ReportInstanceStatusResult reportInstanceStatus(ReportInstanceStatusRequest request) {request = beforeClientExecution(request);return executeReportInstanceStatus(request);}
public DeleteAlarmResult deleteAlarm(DeleteAlarmRequest request) {request = beforeClientExecution(request);return executeDeleteAlarm(request);}
public TokenStream create(TokenStream input) {return new PortugueseStemFilter(input);}
public FtCblsSubRecord() {reserved = new byte[ENCODED_SIZE];}
@Override public boolean remove(Object object) {synchronized (mutex) {return c.remove(object);}}
public GetDedicatedIpResult getDedicatedIp(GetDedicatedIpRequest request) {request = beforeClientExecution(request);return executeGetDedicatedIp(request);}
public String toString() {return precedence + " >= _p";}
public ListStreamProcessorsResult listStreamProcessors(ListStreamProcessorsRequest request) {request = beforeClientExecution(request);return executeListStreamProcessors(request);}
public DeleteLoadBalancerPolicyRequest(String loadBalancerName, String policyName) {setLoadBalancerName(loadBalancerName);setPolicyName(policyName);}
public WindowProtectRecord(int options) {_options = options;}
public UnbufferedCharStream(int bufferSize) {n = 0;data = new int[bufferSize];}
public GetOperationsResult getOperations(GetOperationsRequest request) {request = beforeClientExecution(request);return executeGetOperations(request);}
public void copyRawTo(byte[] b, int o) {NB.encodeInt32(b, o, w1);NB.encodeInt32(b, o + 4, w2);NB.encodeInt32(b, o + 8, w3);NB.encodeInt32(b, o + 12, w4);NB.encodeInt32(b, o + 16, w5);}
public WindowOneRecord(RecordInputStream in) {field_1_h_hold            = in.readShort();field_2_v_hold            = in.readShort();field_3_width             = in.readShort();field_4_height            = in.readShort();field_5_options           = in.readShort();field_6_active_sheet      = in.readShort();field_7_first_visible_tab = in.readShort();field_8_num_selected_tabs = in.readShort();field_9_tab_width_ratio   = in.readShort();}
public StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest request) {request = beforeClientExecution(request);return executeStopWorkspaces(request);}
public void close() throws IOException {if (isOpen) {isOpen = false;try {dump();} finally {try {channel.truncate(fileLength);} finally {try {channel.close();} finally {fos.close();}}}}}
public DescribeMatchmakingRuleSetsResult describeMatchmakingRuleSets(DescribeMatchmakingRuleSetsRequest request) {request = beforeClientExecution(request);return executeDescribeMatchmakingRuleSets(request);}
public String getPronunciation(int wordId, char surface[], int off, int len) {return null; }
public String getPath() {return pathStr;}
public static double devsq(double[] v) {double r = Double.NaN;if (v!=null && v.length >= 1) {double m = 0;double s = 0;int n = v.length;for (int i=0; i<n; i++) {s += v[i];}m = s / n;s = 0;for (int i=0; i<n; i++) {s += (v[i]- m) * (v[i] - m);}r = (n == 1)? 0: s;}return r;}
public DescribeResizeResult describeResize(DescribeResizeRequest request) {request = beforeClientExecution(request);return executeDescribeResize(request);}
public final boolean hasPassedThroughNonGreedyDecision() {return passedThroughNonGreedyDecision;}
public int end() {return end(0);}
public void traverse(CellHandler handler) {int firstRow = range.getFirstRow();int lastRow = range.getLastRow();int firstColumn = range.getFirstColumn();int lastColumn = range.getLastColumn();final int width = lastColumn - firstColumn + 1;SimpleCellWalkContext ctx = new SimpleCellWalkContext();Row currentRow = null;Cell currentCell = null;for (ctx.rowNumber = firstRow; ctx.rowNumber <= lastRow; ++ctx.rowNumber) {currentRow = sheet.getRow(ctx.rowNumber);if (currentRow == null) {continue;}for (ctx.colNumber = firstColumn; ctx.colNumber <= lastColumn; ++ctx.colNumber) {currentCell = currentRow.getCell(ctx.colNumber);if (currentCell == null) {continue;}if (isEmpty(currentCell) && !traverseEmptyCells) {continue;}long rowSize = ArithmeticUtils.mulAndCheck((long)ArithmeticUtils.subAndCheck(ctx.rowNumber, firstRow), (long)width);ctx.ordinalNumber = ArithmeticUtils.addAndCheck(rowSize, (ctx.colNumber - firstColumn + 1));handler.onCell(currentCell, ctx);}}}
public int getReadIndex() {return pos;}
public int compareTo(ScoreTerm other) {if (this.boost == other.boost) return other.bytes.get().compareTo(this.bytes.get());else return Float.compare(this.boost, other.boost);}
public int normalize(char s[], int len) {for (int i = 0; i < len; i++) {switch (s[i]) {case FARSI_YEH:case YEH_BARREE:s[i] = YEH;break;case KEHEH:s[i] = KAF;break;case HEH_YEH:case HEH_GOAL:s[i] = HEH;break;case HAMZA_ABOVE: len = delete(s, i, len);i--;break;default:break;}}return len;}
public void serialize(LittleEndianOutput out) {out.writeShort(_options);}
public DiagnosticErrorListener(boolean exactOnly) {this.exactOnly = exactOnly;}
public KeySchemaElement(String attributeName, KeyType keyType) {setAttributeName(attributeName);setKeyType(keyType.toString());}
public GetAssignmentResult getAssignment(GetAssignmentRequest request) {request = beforeClientExecution(request);return executeGetAssignment(request);}
public boolean hasObject(AnyObjectId id) {return findOffset(id) != -1;}
public GroupingSearch setAllGroups(boolean allGroups) {this.allGroups = allGroups;return this;}
public synchronized void setMultiValued(String dimName, boolean v) {DimConfig ft = fieldTypes.get(dimName);if (ft == null) {ft = new DimConfig();fieldTypes.put(dimName, ft);}ft.multiValued = v;}
public int getCellsVal() {Iterator<Character> i = cells.keySet().iterator();int size = 0;for (; i.hasNext();) {Character c = i.next();Cell e = at(c);if (e.cmd >= 0) {size++;}}return size;}
public DeleteVoiceConnectorResult deleteVoiceConnector(DeleteVoiceConnectorRequest request) {request = beforeClientExecution(request);return executeDeleteVoiceConnector(request);}
public DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) {request = beforeClientExecution(request);return executeDeleteLifecyclePolicy(request);}
public void write(byte[] b) {int len = b.length;checkPosition(len);System.arraycopy(b, 0, _buf, _writeIndex, len);_writeIndex += len;}
public RebaseResult getRebaseResult() {return this.rebaseResult;}
public static int getNearestSetSize(int maxNumberOfValuesExpected,float desiredSaturation) {for (int i = 0; i < usableBitSetSizes.length; i++) {int numSetBitsAtDesiredSaturation = (int) (usableBitSetSizes[i] * desiredSaturation);int estimatedNumUniqueValues = getEstimatedNumberUniqueValuesAllowingForCollisions(usableBitSetSizes[i], numSetBitsAtDesiredSaturation);if (estimatedNumUniqueValues > maxNumberOfValuesExpected) {return usableBitSetSizes[i];}}return -1;}
public DescribeDashboardResult describeDashboard(DescribeDashboardRequest request) {request = beforeClientExecution(request);return executeDescribeDashboard(request);}
public CreateSegmentResult createSegment(CreateSegmentRequest request) {request = beforeClientExecution(request);return executeCreateSegment(request);}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[DBCELL]\n");buffer.append("    .rowoffset = ").append(HexDump.intToHex(field_1_row_offset)).append("\n");for (int k = 0; k < field_2_cell_offsets.length; k++) {buffer.append("    .cell_").append(k).append(" = ").append(HexDump.shortToHex(field_2_cell_offsets[ k ])).append("\n");}buffer.append("[/DBCELL]\n");return buffer.toString();}
public List<String> getUndeletedList() {return undeletedList;}
public String toString() {return "[INTERFACEEND/]\n";}
public MergeScheduler clone() {return this;}
public PlainTextDictionary(Reader reader) {in = new BufferedReader(reader);}
public StringBuilder append(CharSequence csq) {if (csq == null) {appendNull();} else {append0(csq, 0, csq.length());}return this;}
public ListAssociatedStacksResult listAssociatedStacks(ListAssociatedStacksRequest request) {request = beforeClientExecution(request);return executeListAssociatedStacks(request);}
public static double avedev(double[] v) {double r = 0;double m = 0;double s = 0;for (int i=0, iSize=v.length; i<iSize; i++) {s += v[i];}m = s / v.length;s = 0;for (int i=0, iSize=v.length; i<iSize; i++) {s += Math.abs(v[i]-m);}r = s / v.length;return r;}
public DescribeByoipCidrsResult describeByoipCidrs(DescribeByoipCidrsRequest request) {request = beforeClientExecution(request);return executeDescribeByoipCidrs(request);}
public GetDiskResult getDisk(GetDiskRequest request) {request = beforeClientExecution(request);return executeGetDisk(request);}
public DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest request) {request = beforeClientExecution(request);return executeCreateDBClusterParameterGroup(request);}
public static CharBuffer wrap(char[] array, int start, int charCount) {Arrays.checkOffsetAndCount(array.length, start, charCount);CharBuffer buf = new ReadWriteCharArrayBuffer(array);buf.position = start;buf.limit = start + charCount;return buf;}
public SubmoduleStatusType getType() {return type;}
public DescribeGameServerGroupResult describeGameServerGroup(DescribeGameServerGroupRequest request) {request = beforeClientExecution(request);return executeDescribeGameServerGroup(request);}
public Pattern pattern() {return pattern;}
public V setValue(V object) {throw new UnsupportedOperationException();}
public StringBuilder stem(CharSequence word) {CharSequence cmd = stemmer.getLastOnPath(word);if (cmd == null)return null;buffer.setLength(0);buffer.append(word);Diff.apply(buffer, cmd);if (buffer.length() > 0)return buffer;else return null;}
public RenameFaceRequest() {super("CloudPhoto", "2017-07-11", "RenameFace", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public char requireChar(Map<String,String> args, String name) {return require(args, name).charAt(0);}
public static String toStringTree(Tree t) {return toStringTree(t, (List<String>)null);}
public String toString() {return "<deleted/>";}
public GetRepoWebhookLogListRequest() {super("cr", "2016-06-07", "GetRepoWebhookLogList", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks/[WebhookId]/logs");setMethod(MethodType.GET);}
public GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest request) {request = beforeClientExecution(request);return executeGetJobUnlockCode(request);}
public RemoveTagsRequest(String resourceId) {setResourceId(resourceId);}
public short getGB2312Id(char ch) {try {byte[] buffer = Character.toString(ch).getBytes("GB2312");if (buffer.length != 2) {return -1;}int b0 = (buffer[0] & 0x0FF) - 161; int b1 = (buffer[1] & 0x0FF) - 161; return (short) (b0 * 94 + b1);} catch (UnsupportedEncodingException e) {throw new RuntimeException(e);}}
public BatchRefUpdate addCommand(Collection<ReceiveCommand> cmd) {commands.addAll(cmd);return this;}
public short checkExternSheet(int sheetNumber){return (short)getOrCreateLinkTable().checkExternSheet(sheetNumber);}
@Override public boolean equals(Object object) {return c.equals(object);}
public BooleanQuery build(QueryNode queryNode) throws QueryNodeException {AnyQueryNode andNode = (AnyQueryNode) queryNode;BooleanQuery.Builder bQuery = new BooleanQuery.Builder();List<QueryNode> children = andNode.getChildren();if (children != null) {for (QueryNode child : children) {Object obj = child.getTag(QueryTreeBuilder.QUERY_TREE_BUILDER_TAGID);if (obj != null) {Query query = (Query) obj;try {bQuery.add(query, BooleanClause.Occur.SHOULD);} catch (TooManyClauses ex) {throw new QueryNodeException(new MessageImpl(QueryParserMessages.EMPTY_MESSAGE), ex);}}}}bQuery.setMinimumNumberShouldMatch(andNode.getMinimumMatchingElements());return bQuery.build();}
public DescribeStreamProcessorResult describeStreamProcessor(DescribeStreamProcessorRequest request) {request = beforeClientExecution(request);return executeDescribeStreamProcessor(request);}
public DescribeDashboardPermissionsResult describeDashboardPermissions(DescribeDashboardPermissionsRequest request) {request = beforeClientExecution(request);return executeDescribeDashboardPermissions(request);}
public Ref peel(Ref ref) {try {return getRefDatabase().peel(ref);} catch (IOException e) {return ref;}}
public long ramBytesUsed() {return RamUsageEstimator.alignObjectSize(RamUsageEstimator.NUM_BYTES_OBJECT_HEADER+ 2 * Integer.BYTES     + RamUsageEstimator.NUM_BYTES_OBJECT_REF) + RamUsageEstimator.sizeOf(blocks);}
public GetDomainSuggestionsResult getDomainSuggestions(GetDomainSuggestionsRequest request) {request = beforeClientExecution(request);return executeGetDomainSuggestions(request);}
public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest request) {request = beforeClientExecution(request);return executeDescribeStackEvents(request);}
public void setRule(int idx, ConditionalFormattingRule cfRule){setRule(idx, (HSSFConditionalFormattingRule)cfRule);}
public CreateResolverRuleResult createResolverRule(CreateResolverRuleRequest request) {request = beforeClientExecution(request);return executeCreateResolverRule(request);}
public SeriesIndexRecord(RecordInputStream in) {field_1_index = in.readShort();}
public GetStylesRequest() {super("lubancloud", "2018-05-09", "GetStyles", "luban");setMethod(MethodType.POST);}
public void serialize(LittleEndianOutput out) {out.writeShort(field_1_gridset_flag);}
public boolean equals(Object obj) {if (this == obj) {return true;}if (obj == null) {return false;}if (getClass() != obj.getClass()) {return false;}Toffs other = (Toffs) obj;if (getStartOffset() != other.getStartOffset()) {return false;}if (getEndOffset() != other.getEndOffset()) {return false;}return true;}
public CreateGatewayGroupResult createGatewayGroup(CreateGatewayGroupRequest request) {request = beforeClientExecution(request);return executeCreateGatewayGroup(request);}
public CreateParticipantConnectionResult createParticipantConnection(CreateParticipantConnectionRequest request) {request = beforeClientExecution(request);return executeCreateParticipantConnection(request);}
public static double irr(double[] income) {return irr(income, 0.1d);}
public RegisterWorkspaceDirectoryResult registerWorkspaceDirectory(RegisterWorkspaceDirectoryRequest request) {request = beforeClientExecution(request);return executeRegisterWorkspaceDirectory(request);}
public RevertCommand include(AnyObjectId commit) {return include(commit.getName(), commit);}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inumberVE) {ValueEval veText1;try {veText1 = OperandResolver.getSingleValue(inumberVE, srcRowIndex, srcColumnIndex);} catch (EvaluationException e) {return e.getErrorEval();}String iNumber = OperandResolver.coerceValueToString(veText1);Matcher m = COMPLEX_NUMBER_PATTERN.matcher(iNumber);boolean result = m.matches();String imaginary = "";if (result) {String imaginaryGroup = m.group(5);boolean hasImaginaryPart = imaginaryGroup.equals("i") || imaginaryGroup.equals("j");if (imaginaryGroup.length() == 0) {return new StringEval(String.valueOf(0));}if (hasImaginaryPart) {String sign = "";String imaginarySign = m.group(GROUP3_IMAGINARY_SIGN);if (imaginarySign.length() != 0 && !(imaginarySign.equals("+"))) {sign = imaginarySign;}String groupImaginaryNumber = m.group(GROUP4_IMAGINARY_INTEGER_OR_DOUBLE);if (groupImaginaryNumber.length() != 0) {imaginary = sign + groupImaginaryNumber;} else {imaginary = sign + "1";}}} else {return ErrorEval.NUM_ERROR;}return new StringEval(imaginary);}
public E pollLast() {Map.Entry<E, Object> entry = backingMap.pollLastEntry();return (entry == null) ? null : entry.getKey();}
public int readUShort(){int ch1 = readUByte();int ch2 = readUByte();return (ch2 << 8) + (ch1 << 0);}
public ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute, OperationType operationType) {setSnapshotId(snapshotId);setAttribute(attribute.toString());setOperationType(operationType.toString());}
public ListBonusPaymentsResult listBonusPayments(ListBonusPaymentsRequest request) {request = beforeClientExecution(request);return executeListBonusPayments(request);}
public V get(CharSequence cs) {if(cs == null)throw new NullPointerException();return null;}
public TokenFilter create(TokenStream input) {CommonGramsFilter commonGrams = (CommonGramsFilter) super.create(input);return new CommonGramsQueryFilter(commonGrams);}
public String getPath() {return path;}
public InitiateMultipartUploadResult initiateMultipartUpload(InitiateMultipartUploadRequest request) {request = beforeClientExecution(request);return executeInitiateMultipartUpload(request);}
public StringBuilder insert(int offset, int i) {insert0(offset, Integer.toString(i));return this;}
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long block = blocks[blocksOffset++];for (int shift = 62; shift >= 0; shift -= 2) {values[valuesOffset++] = (int) ((block >>> shift) & 3);}}}
public TokenStream create(TokenStream input) {return new ElisionFilter(input, articles);}
public boolean eat(Row in, int remap[]) {int sum = 0;for (Iterator<Cell> i = in.cells.values().iterator(); i.hasNext();) {Cell c = i.next();sum += c.cnt;if (c.ref >= 0) {if (remap[c.ref] == 0) {c.ref = -1;}}}int frame = sum / 10;boolean live = false;for (Iterator<Cell> i = in.cells.values().iterator(); i.hasNext();) {Cell c = i.next();if (c.cnt < frame && c.cmd >= 0) {c.cnt = 0;c.cmd = -1;}if (c.cmd >= 0 || c.ref >= 0) {live |= true;}}return !live;}
final public Token getToken(int index) {Token t = jj_lookingAhead ? jj_scanpos : token;for (int i = 0; i < index; i++) {if (t.next != null) t = t.next;else t = t.next = token_source.getNextToken();}return t;}
public String toString() {StringBuilder sb = new StringBuilder();sb.append(getClass().getName()).append(" [ARRAY]\n");sb.append(" range=").append(getRange()).append("\n");sb.append(" options=").append(HexDump.shortToHex(_options)).append("\n");sb.append(" notUsed=").append(HexDump.intToHex(_field3notUsed)).append("\n");sb.append(" formula:").append("\n");Ptg[] ptgs = _formula.getTokens();for (int i = 0; i < ptgs.length; i++) {Ptg ptg = ptgs[i];sb.append(ptg).append(ptg.getRVAType()).append("\n");}sb.append("]");return sb.toString();}
public GetFolderResult getFolder(GetFolderRequest request) {request = beforeClientExecution(request);return executeGetFolder(request);}
@Override public void add(int location, E object) {throw new UnsupportedOperationException();}
public PositiveScoresOnlyCollector(Collector in) {super(in);}
public CreateRepoBuildRuleRequest() {super("cr", "2016-06-07", "CreateRepoBuildRule", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]/rules");setMethod(MethodType.PUT);}
public BaseRef(AreaEval ae) {_refEval = null;_areaEval = ae;_firstRowIndex = ae.getFirstRow();_firstColumnIndex = ae.getFirstColumn();_height = ae.getLastRow() - ae.getFirstRow() + 1;_width = ae.getLastColumn() - ae.getFirstColumn() + 1;}
public DrawingManager2( EscherDggRecord dgg ) {this.dgg = dgg;}
public void reset() {if (!first())reset(raw);}
public final CharsetDecoder reset() {status = INIT;implReset();return this;}
public BufferedReader(Reader in, int size) {super(in);if (size <= 0) {throw new IllegalArgumentException("size <= 0");}this.in = in;buf = new char[size];}
public DescribeCodeRepositoryResult describeCodeRepository(DescribeCodeRepositoryRequest request) {request = beforeClientExecution(request);return executeDescribeCodeRepository(request);}
public DBSubnetGroup createDBSubnetGroup(CreateDBSubnetGroupRequest request) {request = beforeClientExecution(request);return executeCreateDBSubnetGroup(request);}
public RenameBranchCommand setOldName(String oldName) {checkCallable();this.oldName = oldName;return this;}
public DeleteBranchCommand setForce(boolean force) {checkCallable();this.force = force;return this;}
public StopCompilationJobResult stopCompilationJob(StopCompilationJobRequest request) {request = beforeClientExecution(request);return executeStopCompilationJob(request);}
public synchronized final void incrementSecondaryProgressBy(int diff) {setSecondaryProgress(mSecondaryProgress + diff);}
public int[] clear() {return bytesStart = null;}
public String getRawPath() {return path;}
public GetUserSourceAccountRequest() {super("cr", "2016-06-07", "GetUserSourceAccount", "cr");setUriPattern("/users/sourceAccount");setMethod(MethodType.GET);}
public CreateExportJobResult createExportJob(CreateExportJobRequest request) {request = beforeClientExecution(request);return executeCreateExportJob(request);}
public CreateDedicatedIpPoolResult createDedicatedIpPool(CreateDedicatedIpPoolRequest request) {request = beforeClientExecution(request);return executeCreateDedicatedIpPool(request);}
public boolean equals(Object obj) {if (this == obj) {return true;}if (obj == null) {return false;}if (obj instanceof HSSFCellStyle) {final HSSFCellStyle other = (HSSFCellStyle) obj;if (_format == null) {if (other._format != null) {return false;}} else if (!_format.equals(other._format)) {return false;}if (_index != other._index) {return false;}return true;}return false;}
public ReleaseHostsResult releaseHosts(ReleaseHostsRequest request) {request = beforeClientExecution(request);return executeReleaseHosts(request);}
public boolean equals(Object object) {if (this == object) {return true;}if (object instanceof Set) {Set<?> s = (Set<?>) object;try {return size() == s.size() && containsAll(s);} catch (NullPointerException ignored) {return false;} catch (ClassCastException ignored) {return false;}}return false;}
public void setRefLogMessage(String msg, boolean appendStatus) {customRefLog = true;if (msg == null && !appendStatus) {disableRefLog();} else if (msg == null && appendStatus) {refLogMessage = ""; refLogIncludeResult = true;} else {refLogMessage = msg;refLogIncludeResult = appendStatus;}}
public StreamIDRecord(RecordInputStream in) {idstm = in.readShort();}
public RecognizeCarRequest() {super("visionai-poc", "2020-04-08", "RecognizeCar");setMethod(MethodType.POST);}
public final ByteOrder order() {return ByteOrder.nativeOrder();}
public int getAheadCount() {return aheadCount;}
public boolean isNewFragment() {return false;}
public GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigRequest request) {request = beforeClientExecution(request);return executeGetCloudFrontOriginAccessIdentityConfig(request);}
public boolean matches(int symbol, int minVocabSymbol, int maxVocabSymbol) {return label == symbol;}
public DeleteTransitGatewayResult deleteTransitGateway(DeleteTransitGatewayRequest request) {request = beforeClientExecution(request);return executeDeleteTransitGateway(request);}
public static byte[] grow(byte[] array, int minSize) {assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?";if (array.length < minSize) {return growExact(array, oversize(minSize, Byte.BYTES));} else return array;}
public CreateTransactionRequest() {super("CloudPhoto", "2017-07-11", "CreateTransaction", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public BatchRefUpdate setRefLogIdent(PersonIdent pi) {refLogIdent = pi;return this;}
public GetLaunchTemplateDataResult getLaunchTemplateData(GetLaunchTemplateDataRequest request) {request = beforeClientExecution(request);return executeGetLaunchTemplateData(request);}
public ParseInfo(ProfilingATNSimulator atnSimulator) {this.atnSimulator = atnSimulator;}
public SimpleQQParser(String qqNames[], String indexField) {this.qqNames = qqNames;this.indexField = indexField;}
public DBCluster promoteReadReplicaDBCluster(PromoteReadReplicaDBClusterRequest request) {request = beforeClientExecution(request);return executePromoteReadReplicaDBCluster(request);}
public DescribeCapacityReservationsResult describeCapacityReservations(DescribeCapacityReservationsRequest request) {request = beforeClientExecution(request);return executeDescribeCapacityReservations(request);}
public String toString() {return "IndexSearcher(" + reader + "; executor=" + executor + "; sliceExecutionControlPlane " + sliceExecutor + ")";}
public final boolean incrementToken() {return false;}
public void serialize(LittleEndianOutput out) {out.writeShort(main + 1);out.writeShort(subFrom);out.writeShort(subTo);}
public void decode(byte[] blocks, int blocksOffset, int[] values,int valuesOffset, int iterations) {if (bitsPerValue > 32) {throw new UnsupportedOperationException("Cannot decode " + bitsPerValue + "-bits values into an int[]");}for (int i = 0; i < iterations; ++i) {final long block = readLong(blocks, blocksOffset);blocksOffset += 8;valuesOffset = decode(block, values, valuesOffset);}}
public boolean isExpectedToken(int symbol) {ATN atn = getInterpreter().atn;ParserRuleContext ctx = _ctx;ATNState s = atn.states.get(getState());IntervalSet following = atn.nextTokens(s);if (following.contains(symbol)) {return true;}if ( !following.contains(Token.EPSILON) ) return false;while ( ctx!=null && ctx.invokingState>=0 && following.contains(Token.EPSILON) ) {ATNState invokingState = atn.states.get(ctx.invokingState);RuleTransition rt = (RuleTransition)invokingState.transition(0);following = atn.nextTokens(rt.followState);if (following.contains(symbol)) {return true;}ctx = (ParserRuleContext)ctx.parent;}if ( following.contains(Token.EPSILON) && symbol == Token.EOF ) {return true;}return false;}
public UpdateStreamResult updateStream(UpdateStreamRequest request) {request = beforeClientExecution(request);return executeUpdateStream(request);}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {try {OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);return ErrorEval.NA;} catch (EvaluationException e) {int result = translateErrorCodeToErrorTypeValue(e.getErrorEval().getErrorCode());return new NumberEval(result);}}
public String toString() {return getClass().getName() + " [" + _index + " " + _name + "]";}
public ListAssignmentsForHITResult listAssignmentsForHIT(ListAssignmentsForHITRequest request) {request = beforeClientExecution(request);return executeListAssignmentsForHIT(request);}
public DeleteAccessControlRuleResult deleteAccessControlRule(DeleteAccessControlRuleRequest request) {request = beforeClientExecution(request);return executeDeleteAccessControlRule(request);}
public Arc<Long> getFirstArc(FST.Arc<Long> arc) {return fst.getFirstArc(arc);}
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long block = blocks[blocksOffset++];for (int shift = 48; shift >= 0; shift -= 16) {values[valuesOffset++] = (int) ((block >>> shift) & 65535);}}}
public long skip(long charCount) throws IOException {if (charCount < 0) {throw new IllegalArgumentException("charCount < 0: " + charCount);}synchronized (lock) {checkNotClosed();if (charCount == 0) {return 0;}long inSkipped;int availableFromBuffer = buf.length - pos;if (availableFromBuffer > 0) {long requiredFromIn = charCount - availableFromBuffer;if (requiredFromIn <= 0) {pos += charCount;return charCount;}pos += availableFromBuffer;inSkipped = in.skip(requiredFromIn);} else {inSkipped = in.skip(charCount);}return inSkipped + availableFromBuffer;}}
public Map<String, Ref> getRefsMap() {return advertisedRefs;}
public UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest request) {request = beforeClientExecution(request);return executeUpdateApiKey(request);}
public ObjectStream openStream() throws MissingObjectException, IOException {PackInputStream packIn;@SuppressWarnings("resource")DfsReader ctx = db.newReader();try {try {packIn = new PackInputStream(pack, objectOffset + headerLength, ctx);ctx = null; } catch (IOException packGone) {ObjectId obj = pack.getReverseIdx(ctx).findObject(objectOffset);return ctx.open(obj, type).openStream();}} finally {if (ctx != null) {ctx.close();}}int bufsz = 8192;InputStream in = new BufferedInputStream(new InflaterInputStream(packIn, packIn.ctx.inflater(), bufsz),bufsz);return new ObjectStream.Filter(type, size, in);}
public ArrayList() {array = EmptyArray.OBJECT;}
public UpdateDetectorVersionResult updateDetectorVersion(UpdateDetectorVersionRequest request) {request = beforeClientExecution(request);return executeUpdateDetectorVersion(request);}
public void resize(){resize(Double.MAX_VALUE);}
public RevFlagSet(Collection<RevFlag> s) {this();addAll(s);}
public int size() {return size;}
public final long getLong() {int newPosition = position + SizeOf.LONG;if (newPosition > limit) {throw new BufferUnderflowException();}long result = Memory.peekLong(backingArray, offset + position, order);position = newPosition;return result;}
public StringBuilder insert(int offset, long l) {insert0(offset, Long.toString(l));return this;}
public TurkishLowerCaseFilter(TokenStream in) {super(in);}
public ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) {MultiMap<String, ParseTree> labels = new MultiMap<String, ParseTree>();ParseTree mismatchedNode = matchImpl(tree, pattern.getPatternTree(), labels);return new ParseTreeMatch(tree, pattern, labels, mismatchedNode);}
public void addIfNoOverlap( WeightedPhraseInfo wpi ){for( WeightedPhraseInfo existWpi : getPhraseList() ){if( existWpi.isOffsetOverlap( wpi ) ) {existWpi.getTermsInfos().addAll( wpi.getTermsInfos() );return;}}getPhraseList().add( wpi );}
public ThreeWayMerger newMerger(Repository db) {return new InCoreMerger(db);}
public float docScore(int docId, String field, int numPayloadsSeen, float payloadScore) {return numPayloadsSeen > 0 ? (payloadScore / numPayloadsSeen) : 1;}
public Collection<ParseTree> evaluate(ParseTree t) {return Trees.findAllRuleNodes(t, ruleIndex);}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[CFRULE]\n");buffer.append("    .condition_type   =").append(getConditionType()).append("\n");buffer.append("    OPTION FLAGS=0x").append(Integer.toHexString(getOptions())).append("\n");if (containsFontFormattingBlock()) {buffer.append(_fontFormatting).append("\n");}if (containsBorderFormattingBlock()) {buffer.append(_borderFormatting).append("\n");}if (containsPatternFormattingBlock()) {buffer.append(_patternFormatting).append("\n");}buffer.append("    Formula 1 =").append(Arrays.toString(getFormula1().getTokens())).append("\n");buffer.append("    Formula 2 =").append(Arrays.toString(getFormula2().getTokens())).append("\n");buffer.append("[/CFRULE]\n");return buffer.toString();}
public DescribeServiceUpdatesResult describeServiceUpdates(DescribeServiceUpdatesRequest request) {request = beforeClientExecution(request);return executeDescribeServiceUpdates(request);}
public String getNameName(int index){return getNameAt(index).getNameName();}
public DescribeLocationsResult describeLocations() {return describeLocations(new DescribeLocationsRequest());}
public String toString() {return "<phraseslop value='" + getValueString() + "'>" + "\n"+ getChild().toString() + "\n</phraseslop>";}
public DirCacheEntry getDirCacheEntry() {return currentSubtree == null ? currentEntry : null;}
public IntBuffer put(int[] src, int srcOffset, int intCount) {Arrays.checkOffsetAndCount(src.length, srcOffset, intCount);if (intCount > remaining()) {throw new BufferOverflowException();}for (int i = srcOffset; i < srcOffset + intCount; ++i) {put(src[i]);}return this;}
public void trimToSize() {int s = size;if (s == array.length) {return;}if (s == 0) {array = EmptyArray.OBJECT;} else {Object[] newArray = new Object[s];System.arraycopy(array, 0, newArray, 0, s);array = newArray;}modCount++;}
public DescribeLocalGatewayVirtualInterfacesResult describeLocalGatewayVirtualInterfaces(DescribeLocalGatewayVirtualInterfacesRequest request) {request = beforeClientExecution(request);return executeDescribeLocalGatewayVirtualInterfaces(request);}
public TokenStream create(TokenStream input) {return new RussianLightStemFilter(input);}
public int [] toArray(final int [] a){int[] rval;if (a.length == _limit){System.arraycopy(_array, 0, a, 0, _limit);rval = a;}else{rval = toArray();}return rval;}
public BasicSessionCredentials(String accessKeyId, String accessKeySecret, String sessionToken,long roleSessionDurationSeconds) {if (accessKeyId == null) {throw new IllegalArgumentException("Access key ID cannot be null.");}if (accessKeySecret == null) {throw new IllegalArgumentException("Access key secret cannot be null.");}this.accessKeyId = accessKeyId;this.accessKeySecret = accessKeySecret;this.sessionToken = sessionToken;this.roleSessionDurationSeconds = roleSessionDurationSeconds;this.sessionStartedTimeInMilliSeconds = System.currentTimeMillis();}
public final ShortBuffer get(short[] dst, int dstOffset, int shortCount) {if (shortCount > remaining()) {throw new BufferUnderflowException();}System.arraycopy(backingArray, offset + position, dst, dstOffset, shortCount);position += shortCount;return this;}
public ActivateEventSourceResult activateEventSource(ActivateEventSourceRequest request) {request = beforeClientExecution(request);return executeActivateEventSource(request);}
public DescribeReceiptRuleSetResult describeReceiptRuleSet(DescribeReceiptRuleSetRequest request) {request = beforeClientExecution(request);return executeDescribeReceiptRuleSet(request);}
public Filter(String name) {setName(name);}
public DoubleBuffer put(double c) {throw new ReadOnlyBufferException();}
public CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest request) {request = beforeClientExecution(request);return executeCreateTrafficPolicyInstance(request);}
public JapaneseIterationMarkCharFilter(Reader input, boolean normalizeKanji, boolean normalizeKana) {super(input);this.normalizeKanji = normalizeKanji;this.normalizeKana = normalizeKana;buffer.reset(input);}
public void writeLong(long v) {writeInt((int)(v >>  0));writeInt((int)(v >> 32));}
public FileResolver() {exports = new ConcurrentHashMap<>();exportBase = new CopyOnWriteArrayList<>();}
public ValueEval getRef3DEval(Ref3DPxg rptg) {SheetRangeEvaluator sre = createExternSheetRefEvaluator(rptg.getSheetName(), rptg.getLastSheetName(), rptg.getExternalWorkbookNumber());return new LazyRefEval(rptg.getRow(), rptg.getColumn(), sre);}
public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) {request = beforeClientExecution(request);return executeDeleteDataset(request);}
public StartRelationalDatabaseResult startRelationalDatabase(StartRelationalDatabaseRequest request) {request = beforeClientExecution(request);return executeStartRelationalDatabase(request);}
public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings() {return describeReservedCacheNodesOfferings(new DescribeReservedCacheNodesOfferingsRequest());}
static public double pmt(double r, int nper, double pv, double fv, int type) {return -r * (pv * Math.pow(1 + r, nper) + fv) / ((1 + r*type) * (Math.pow(1 + r, nper) - 1));}
public DescribeDocumentVersionsResult describeDocumentVersions(DescribeDocumentVersionsRequest request) {request = beforeClientExecution(request);return executeDescribeDocumentVersions(request);}
public ListPublishingDestinationsResult listPublishingDestinations(ListPublishingDestinationsRequest request) {request = beforeClientExecution(request);return executeListPublishingDestinations(request);}
public DeleteAccountAliasRequest(String accountAlias) {setAccountAlias(accountAlias);}
public static long[] grow(long[] array) {return grow(array, 1 + array.length);}
public String outputToString(Object output) {if (!(output instanceof List)) {return outputs.outputToString((T) output);} else {List<T> outputList = (List<T>) output;StringBuilder b = new StringBuilder();b.append('[');for(int i=0;i<outputList.size();i++) {if (i > 0) {b.append(", ");}b.append(outputs.outputToString(outputList.get(i)));}b.append(']');return b.toString();}}
public void notifyDeleteCell(Cell cell) {_bookEvaluator.notifyDeleteCell(new HSSFEvaluationCell((HSSFCell)cell));}
public StringBuilder replace(int start, int end, String str) {replace0(start, end, str);return this;}
public SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest request) {request = beforeClientExecution(request);return executeSetIdentityPoolConfiguration(request);}
public static double kthSmallest(double[] v, int k) {double r = Double.NaN;int index = k-1; if (v!=null && v.length > index && index >= 0) {Arrays.sort(v);r = v[index];}return r;}
public void set(int index, long value) {final int o = index >>> 5;final int b = index & 31;final int shift = b << 1;blocks[o] = (blocks[o] & ~(3L << shift)) | (value << shift);}
public String toString() {if (getChildren() == null || getChildren().size() == 0)return "<boolean operation='and'/>";StringBuilder sb = new StringBuilder();sb.append("<boolean operation='and'>");for (QueryNode child : getChildren()) {sb.append("\n");sb.append(child.toString());}sb.append("\n</boolean>");return sb.toString();}
public int sumTokenSizes(int fromIx, int toIx) {int result = 0;for (int i=fromIx; i<toIx; i++) {result += _ptgs[i].getSize();}return result;}
public void setReadonly(boolean readonly) {if ( this.readonly && !readonly ) throw new IllegalStateException("can't alter readonly IntervalSet");this.readonly = readonly;}
public final void clearConsumingCell(FormulaCellCacheEntry cce) {if(!_consumingCells.remove(cce)) {throw new IllegalStateException("Specified formula cell is not consumed by this cell");}}
@Override public List<E> subList(int start, int end) {synchronized (mutex) {return new SynchronizedRandomAccessList<E>(list.subList(start, end), mutex);}}
public FileHeader getFileHeader() {return file;}
public AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest request) {request = beforeClientExecution(request);return executeAttachLoadBalancers(request);}
public InitiateJobRequest(String accountId, String vaultName, JobParameters jobParameters) {setAccountId(accountId);setVaultName(vaultName);setJobParameters(jobParameters);}
public String toString() {return "SPL";}
public ReplaceableAttribute(String name, String value, Boolean replace) {setName(name);setValue(value);setReplace(replace);}
public final void add(IndexableField field) {fields.add(field);}
public DeleteStackSetResult deleteStackSet(DeleteStackSetRequest request) {request = beforeClientExecution(request);return executeDeleteStackSet(request);}
public GetRepoBuildRuleListRequest() {super("cr", "2016-06-07", "GetRepoBuildRuleList", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]/rules");setMethod(MethodType.GET);}
public SparseArray(int initialCapacity) {initialCapacity = ArrayUtils.idealIntArraySize(initialCapacity);mKeys = new int[initialCapacity];mValues = new Object[initialCapacity];mSize = 0;}
public InvokeServiceRequest() {super("industry-brain", "2018-07-12", "InvokeService");setMethod(MethodType.POST);}
public ListAlbumPhotosRequest() {super("CloudPhoto", "2017-07-11", "ListAlbumPhotos", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public boolean hasPrevious() {return link != list.voidLink;}
public DeleteHsmConfigurationResult deleteHsmConfiguration(DeleteHsmConfigurationRequest request) {request = beforeClientExecution(request);return executeDeleteHsmConfiguration(request);}
public CreateLoadBalancerRequest(String loadBalancerName) {setLoadBalancerName(loadBalancerName);}
public String getUserInfo() {return decode(userInfo);}
public TagAttendeeResult tagAttendee(TagAttendeeRequest request) {request = beforeClientExecution(request);return executeTagAttendee(request);}
public String getRefName() {return name;}
public SpanNearQuery build() {return new SpanNearQuery(clauses.toArray(new SpanQuery[clauses.size()]), slop, ordered);}
public boolean isSubTotal(int rowIndex, int columnIndex) {return false;}
public DescribeDBProxiesResult describeDBProxies(DescribeDBProxiesRequest request) {request = beforeClientExecution(request);return executeDescribeDBProxies(request);}
public GetVoiceConnectorProxyResult getVoiceConnectorProxy(GetVoiceConnectorProxyRequest request) {request = beforeClientExecution(request);return executeGetVoiceConnectorProxy(request);}
public WindowCacheConfig fromConfig(Config rc) {setPackedGitUseStrongRefs(rc.getBoolean(CONFIG_CORE_SECTION,CONFIG_KEY_PACKED_GIT_USE_STRONGREFS,isPackedGitUseStrongRefs()));setPackedGitOpenFiles(rc.getInt(CONFIG_CORE_SECTION, null,CONFIG_KEY_PACKED_GIT_OPENFILES, getPackedGitOpenFiles()));setPackedGitLimit(rc.getLong(CONFIG_CORE_SECTION, null,CONFIG_KEY_PACKED_GIT_LIMIT, getPackedGitLimit()));setPackedGitWindowSize(rc.getInt(CONFIG_CORE_SECTION, null,CONFIG_KEY_PACKED_GIT_WINDOWSIZE, getPackedGitWindowSize()));setPackedGitMMAP(rc.getBoolean(CONFIG_CORE_SECTION, null,CONFIG_KEY_PACKED_GIT_MMAP, isPackedGitMMAP()));setDeltaBaseCacheLimit(rc.getInt(CONFIG_CORE_SECTION, null,CONFIG_KEY_DELTA_BASE_CACHE_LIMIT, getDeltaBaseCacheLimit()));long maxMem = Runtime.getRuntime().maxMemory();long sft = rc.getLong(CONFIG_CORE_SECTION, null,CONFIG_KEY_STREAM_FILE_TRESHOLD, getStreamFileThreshold());sft = Math.min(sft, maxMem / 4); sft = Math.min(sft, Integer.MAX_VALUE); setStreamFileThreshold((int) sft);return this;}
public static Date getJavaDate(double date) {return getJavaDate(date, false, null, false);}
public StartPersonTrackingResult startPersonTracking(StartPersonTrackingRequest request) {request = beforeClientExecution(request);return executeStartPersonTracking(request);}
@Override public int size() {return totalSize;}
public GetRouteResult getRoute(GetRouteRequest request) {request = beforeClientExecution(request);return executeGetRoute(request);}
public DeleteClusterResult deleteCluster(DeleteClusterRequest request) {request = beforeClientExecution(request);return executeDeleteCluster(request);}
public String toString(){StringBuilder buffer = new StringBuilder();buffer.append("[MMS]\n");buffer.append("    .addMenu        = ").append(Integer.toHexString(getAddMenuCount())).append("\n");buffer.append("    .delMenu        = ").append(Integer.toHexString(getDelMenuCount())).append("\n");buffer.append("[/MMS]\n");return buffer.toString();}
public FileBasedConfig(Config base, File cfgLocation, FS fs) {super(base);configFile = cfgLocation;this.fs = fs;this.snapshot = FileSnapshot.DIRTY;this.hash = ObjectId.zeroId();}
public int following(int pos) {if (pos < text.getBeginIndex() || pos > text.getEndIndex()) {throw new IllegalArgumentException("offset out of bounds");} else if (0 == sentenceStarts.length) {text.setIndex(text.getBeginIndex());return DONE;} else if (pos >= sentenceStarts[sentenceStarts.length - 1]) {text.setIndex(text.getEndIndex());currentSentence = sentenceStarts.length - 1;return DONE;} else { currentSentence = (sentenceStarts.length - 1) / 2; moveToSentenceAt(pos, 0, sentenceStarts.length - 2);text.setIndex(sentenceStarts[++currentSentence]);return current();}}
public UpdateParameterGroupResult updateParameterGroup(UpdateParameterGroupRequest request) {request = beforeClientExecution(request);return executeUpdateParameterGroup(request);}
public SeriesChartGroupIndexRecord clone() {return copy();}
public static double calcDistanceFromErrPct(Shape shape, double distErrPct, SpatialContext ctx) {if (distErrPct < 0 || distErrPct > 0.5) {throw new IllegalArgumentException("distErrPct " + distErrPct + " must be between [0 to 0.5]");}if (distErrPct == 0 || shape instanceof Point) {return 0;}Rectangle bbox = shape.getBoundingBox();Point ctr = bbox.getCenter();double y = (ctr.getY() >= 0 ? bbox.getMaxY() : bbox.getMinY());double diagonalDist = ctx.getDistCalc().distance(ctr, bbox.getMaxX(), y);return diagonalDist * distErrPct;}
public int codePointAt(int index) {if (index < 0 || index >= count) {throw indexAndLength(index);}return Character.codePointAt(value, index, count);}
public void setPasswordVerifier(int passwordVerifier) {this.passwordVerifier = passwordVerifier;}
public ListVaultsRequest(String accountId) {setAccountId(accountId);}
public SquashMessageFormatter() {dateFormatter = new GitDateFormatter(Format.DEFAULT);}
public GetVideoCoverRequest() {super("CloudPhoto", "2017-07-11", "GetVideoCover", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public int lastIndexOf(Object object) {int pos = size;Link<E> link = voidLink.previous;if (object != null) {while (link != voidLink) {pos--;if (object.equals(link.data)) {return pos;}link = link.previous;}} else {while (link != voidLink) {pos--;if (link.data == null) {return pos;}link = link.previous;}}return -1;}
public DescribeSpotFleetRequestsResult describeSpotFleetRequests(DescribeSpotFleetRequestsRequest request) {request = beforeClientExecution(request);return executeDescribeSpotFleetRequests(request);}
public IndexFacesResult indexFaces(IndexFacesRequest request) {request = beforeClientExecution(request);return executeIndexFaces(request);}
public RuleBasedBreakIterator getBreakIterator(int script) {switch(script) {case UScript.JAPANESE: return (RuleBasedBreakIterator)cjkBreakIterator.clone();case UScript.MYANMAR:if (myanmarAsWords) {return (RuleBasedBreakIterator)defaultBreakIterator.clone();} else {return (RuleBasedBreakIterator)myanmarSyllableIterator.clone();}default: return (RuleBasedBreakIterator)defaultBreakIterator.clone();}}
public String toString(){StringBuilder b = new StringBuilder();b.append("[DCONREF]\n");b.append("    .ref\n");b.append("        .firstrow   = ").append(firstRow).append("\n");b.append("        .lastrow    = ").append(lastRow).append("\n");b.append("        .firstcol   = ").append(firstCol).append("\n");b.append("        .lastcol    = ").append(lastCol).append("\n");b.append("    .cch            = ").append(charCount).append("\n");b.append("    .stFile\n");b.append("        .h          = ").append(charType).append("\n");b.append("        .rgb        = ").append(getReadablePath()).append("\n");b.append("[/DCONREF]\n");return b.toString();}
public int getPackedGitOpenFiles() {return packedGitOpenFiles;}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[FEATURE HEADER]\n");buffer.append("[/FEATURE HEADER]\n");return buffer.toString();}
public static byte[] getToUnicodeLE(String string) {return string.getBytes(UTF16LE);}
public final List<String> getFooterLines(String keyName) {return getFooterLines(new FooterKey(keyName));}
public void refresh() {super.refresh();clearReferences();}
public float get(int index) {checkIndex(index);return byteBuffer.getFloat(index * SizeOf.FLOAT);}
public DeleteDetectorResult deleteDetector(DeleteDetectorRequest request) {request = beforeClientExecution(request);return executeDeleteDetector(request);}
public int[] grow() {assert bytesStart != null;return bytesStart = ArrayUtil.grow(bytesStart, bytesStart.length + 1);}
public ListExclusionsResult listExclusions(ListExclusionsRequest request) {request = beforeClientExecution(request);return executeListExclusions(request);}
public static SpatialStrategy getSpatialStrategy(int roundNumber) {SpatialStrategy result = spatialStrategyCache.get(roundNumber);if (result == null) {throw new IllegalStateException("Strategy should have been init'ed by SpatialDocMaker by now");}return result;}
public DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest request) {request = beforeClientExecution(request);return executeRestoreDBClusterToPointInTime(request);}
public void serialize(LittleEndianOutput out) {out.writeShort(field_1_categoryDataType);out.writeShort(field_2_valuesDataType);out.writeShort(field_3_numCategories);out.writeShort(field_4_numValues);out.writeShort(field_5_bubbleSeriesType);out.writeShort(field_6_numBubbleValues);}
public PostAgentProfileResult postAgentProfile(PostAgentProfileRequest request) {request = beforeClientExecution(request);return executePostAgentProfile(request);}
public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {if ( getTokenStream()!=null ) {TokenSource tokenSource = getTokenStream().getTokenSource();if ( tokenSource instanceof Lexer ) {Lexer lexer = (Lexer)tokenSource;return compileParseTreePattern(pattern, patternRuleIndex, lexer);}}throw new UnsupportedOperationException("Parser can't discover a lexer to use");}
public BacktrackDBClusterResult backtrackDBCluster(BacktrackDBClusterRequest request) {request = beforeClientExecution(request);return executeBacktrackDBCluster(request);}
public String getName() {return strategyName;}
public void copyTo(byte[] b, int o) {formatHexByte(b, o + 0, w1);formatHexByte(b, o + 8, w2);formatHexByte(b, o + 16, w3);formatHexByte(b, o + 24, w4);formatHexByte(b, o + 32, w5);}
public static final IntList lineMap(byte[] buf, int ptr, int end) {IntList map = new IntList((end - ptr) / 36);map.fillTo(1, Integer.MIN_VALUE);for (; ptr < end; ptr = nextLF(buf, ptr)) {map.add(ptr);}map.add(end);return map;}
public Set<ObjectId> getAdditionalHaves() {return Collections.emptySet();}
public synchronized long ramBytesUsed() {long sizeInBytes = BASE_RAM_BYTES_USED + fields.size() * 2 * RamUsageEstimator.NUM_BYTES_OBJECT_REF;for(SimpleTextTerms simpleTextTerms : termsCache.values()) {sizeInBytes += (simpleTextTerms!=null) ? simpleTextTerms.ramBytesUsed() : 0;}return sizeInBytes;}
public String toXml(String tab) {StringBuilder builder = new StringBuilder();builder.append(tab).append("<").append(getRecordName()).append(">\n");for (EscherRecord escherRecord : getEscherRecords()) {builder.append(escherRecord.toXml(tab + "\t"));}builder.append(tab).append("</").append(getRecordName()).append(">\n");return builder.toString();}
public TokenStream create(TokenStream input) {return new GalicianMinimalStemFilter(input);}
public String toString() {StringBuilder r = new StringBuilder();r.append("Commit");r.append("={\n");r.append("tree ");r.append(treeId != null ? treeId.name() : "NOT_SET");r.append("\n");for (ObjectId p : parentIds) {r.append("parent ");r.append(p.name());r.append("\n");}r.append("author ");r.append(author != null ? author.toString() : "NOT_SET");r.append("\n");r.append("committer ");r.append(committer != null ? committer.toString() : "NOT_SET");r.append("\n");r.append("gpgSignature ");r.append(gpgSignature != null ? gpgSignature.toString() : "NOT_SET");r.append("\n");if (encoding != null && !References.isSameObject(encoding, UTF_8)) {r.append("encoding ");r.append(encoding.name());r.append("\n");}r.append("\n");r.append(message != null ? message : "");r.append("}");return r.toString();}
public IndicNormalizationFilterFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public OptionGroup createOptionGroup(CreateOptionGroupRequest request) {request = beforeClientExecution(request);return executeCreateOptionGroup(request);}
public AssociateMemberAccountResult associateMemberAccount(AssociateMemberAccountRequest request) {request = beforeClientExecution(request);return executeAssociateMemberAccount(request);}
public void run() {doRefreshProgress(mId, mProgress, mFromUser, true);mRefreshProgressRunnable = this;}
public SetTerminationProtectionResult setTerminationProtection(SetTerminationProtectionRequest request) {request = beforeClientExecution(request);return executeSetTerminationProtection(request);}
public String getErrorHeader(RecognitionException e) {int line = e.getOffendingToken().getLine();int charPositionInLine = e.getOffendingToken().getCharPositionInLine();return "line "+line+":"+charPositionInLine;}
public CharBuffer asReadOnlyBuffer() {CharToByteBufferAdapter buf = new CharToByteBufferAdapter(byteBuffer.asReadOnlyBuffer());buf.limit = limit;buf.position = position;buf.mark = mark;buf.byteBuffer.order = byteBuffer.order;return buf;}
public StopSentimentDetectionJobResult stopSentimentDetectionJob(StopSentimentDetectionJobRequest request) {request = beforeClientExecution(request);return executeStopSentimentDetectionJob(request);}
public ObjectIdSubclassMap<ObjectId> getNewObjectIds() {if (newObjectIds != null)return newObjectIds;return new ObjectIdSubclassMap<>();}
public void clear() {hash = hash(new byte[0]);super.clear();}
public void reset() throws IOException {synchronized (lock) {checkNotClosed();if (mark == -1) {throw new IOException("Invalid mark");}pos = mark;}}
public RefErrorPtg(LittleEndianInput in)  {field_1_reserved = in.readInt();}
public SuspendGameServerGroupResult suspendGameServerGroup(SuspendGameServerGroupRequest request) {request = beforeClientExecution(request);return executeSuspendGameServerGroup(request);}
public final ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {if (args.length != 3) {return ErrorEval.VALUE_INVALID;}return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]);}
public GetRepoRequest() {super("cr", "2016-06-07", "GetRepo", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]");setMethod(MethodType.GET);}
public void setDate(Date date) {if (date != null) {setDate(DateTools.dateToString(date, DateTools.Resolution.SECOND));} else {this.date = null;}}
public TokenStream create(TokenStream input) {return new GermanMinimalStemFilter(input);}
public Object[] toArray() {return a.clone();}
public void write(char[] buffer, int offset, int len) {Arrays.checkOffsetAndCount(buffer.length, offset, len);synchronized (lock) {expand(len);System.arraycopy(buffer, offset, this.buf, this.count, len);this.count += len;}}
public static final RevFilter after(Date ts) {return after(ts.getTime());}
public DeleteGroupPolicyRequest(String groupName, String policyName) {setGroupName(groupName);setPolicyName(policyName);}
public DeregisterTransitGatewayMulticastGroupMembersResult deregisterTransitGatewayMulticastGroupMembers(DeregisterTransitGatewayMulticastGroupMembersRequest request) {request = beforeClientExecution(request);return executeDeregisterTransitGatewayMulticastGroupMembers(request);}
public BatchDeleteScheduledActionResult batchDeleteScheduledAction(BatchDeleteScheduledActionRequest request) {request = beforeClientExecution(request);return executeBatchDeleteScheduledAction(request);}
public CreateAlgorithmResult createAlgorithm(CreateAlgorithmRequest request) {request = beforeClientExecution(request);return executeCreateAlgorithm(request);}
public int readUByte() {return readByte() & 0x00FF;}
public void setLength(int sz) {NB.encodeInt32(info, infoOffset + P_SIZE, sz);}
public DescribeScalingProcessTypesResult describeScalingProcessTypes() {return describeScalingProcessTypes(new DescribeScalingProcessTypesRequest());}
public ListResourceRecordSetsResult listResourceRecordSets(ListResourceRecordSetsRequest request) {request = beforeClientExecution(request);return executeListResourceRecordSets(request);}
public Token recoverInline(Parser recognizer)throws RecognitionException{InputMismatchException e = new InputMismatchException(recognizer);for (ParserRuleContext context = recognizer.getContext(); context != null; context = context.getParent()) {context.exception = e;}throw new ParseCancellationException(e);}
public SetTagsForResourceResult setTagsForResource(SetTagsForResourceRequest request) {request = beforeClientExecution(request);return executeSetTagsForResource(request);}
public ModifyStrategyRequest() {super("CloudCallCenter", "2017-07-05", "ModifyStrategy", "CloudCallCenter", "innerAPI");}
public DescribeVpcEndpointServicesResult describeVpcEndpointServices(DescribeVpcEndpointServicesRequest request) {request = beforeClientExecution(request);return executeDescribeVpcEndpointServices(request);}
public EnableLoggingResult enableLogging(EnableLoggingRequest request) {request = beforeClientExecution(request);return executeEnableLogging(request);}
public boolean contains(Object o) {return ConcurrentHashMap.this.containsValue(o);}
public SheetRangeIdentifier(String bookName, NameIdentifier firstSheetIdentifier, NameIdentifier lastSheetIdentifier) {super(bookName, firstSheetIdentifier);_lastSheetIdentifier = lastSheetIdentifier;}
public DomainMetadataRequest(String domainName) {setDomainName(domainName);}
public ParseException(Token currentTokenVal,int[][] expectedTokenSequencesVal, String[] tokenImageVal) {super(new MessageImpl(QueryParserMessages.INVALID_SYNTAX, initialise(currentTokenVal, expectedTokenSequencesVal, tokenImageVal)));this.currentToken = currentTokenVal;this.expectedTokenSequences = expectedTokenSequencesVal;this.tokenImage = tokenImageVal;}
public FetchPhotosRequest() {super("CloudPhoto", "2017-07-11", "FetchPhotos", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public PrintWriter writer() {return writer;}
public NGramTokenizerFactory(Map<String, String> args) {super(args);minGramSize = getInt(args, "minGramSize", NGramTokenizer.DEFAULT_MIN_NGRAM_SIZE);maxGramSize = getInt(args, "maxGramSize", NGramTokenizer.DEFAULT_MAX_NGRAM_SIZE);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public boolean isDirectoryFileConflict() {return dfConflict != null;}
public IndonesianStemFilter(TokenStream input, boolean stemDerivational) {super(input);this.stemDerivational = stemDerivational;}
public CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest request) {request = beforeClientExecution(request);return executeCreateTrafficPolicy(request);}
public void serialize(LittleEndianOutput out) {out.writeInt(fSD);out.writeInt(passwordVerifier);StringUtil.writeUnicodeString(out, title);out.write(securityDescriptor);}
public static double floor(double n, double s) {if (s==0 && n!=0) {return Double.NaN;} else {return (n==0 || s==0) ? 0 : Math.floor(n/s) * s;}}
public ByteArrayDataOutput(byte[] bytes, int offset, int len) {reset(bytes, offset, len);}
public static List<Tree> getChildren(Tree t) {List<Tree> kids = new ArrayList<Tree>();for (int i=0; i<t.getChildCount(); i++) {kids.add(t.getChild(i));}return kids;}
public void clear() {Hashtable.this.clear();}
public RefreshAllRecord(boolean refreshAll) {this(0);setRefreshAll(refreshAll);}
public DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest request) {request = beforeClientExecution(request);return executeDeleteNamedQuery(request);}
public GraphvizFormatter(ConnectionCosts costs) {this.costs = costs;this.bestPathMap = new HashMap<>();sb.append(formatHeader());sb.append("  init [style=invis]\n");sb.append("  init -> 0.0 [label=\"" + BOS_LABEL + "\"]\n");}
public CheckMultiagentRequest() {super("visionai-poc", "2020-04-08", "CheckMultiagent");setMethod(MethodType.POST);}
public ListUserProfilesResult listUserProfiles(ListUserProfilesRequest request) {request = beforeClientExecution(request);return executeListUserProfiles(request);}
public CreateRelationalDatabaseFromSnapshotResult createRelationalDatabaseFromSnapshot(CreateRelationalDatabaseFromSnapshotRequest request) {request = beforeClientExecution(request);return executeCreateRelationalDatabaseFromSnapshot(request);}
public StartTaskResult startTask(StartTaskRequest request) {request = beforeClientExecution(request);return executeStartTask(request);}
public Set<String> getIgnoredPaths() {return ignoredPaths;}
public FeatSmartTag(RecordInputStream in) {data = in.readRemainder();}
public Change(ChangeAction action, ResourceRecordSet resourceRecordSet) {setAction(action.toString());setResourceRecordSet(resourceRecordSet);}
